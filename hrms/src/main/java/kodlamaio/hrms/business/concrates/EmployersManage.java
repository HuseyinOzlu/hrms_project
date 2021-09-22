package kodlamaio.hrms.business.concrates;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.business.verification.abstracts.HrmsPersonelCheckService;
import kodlamaio.hrms.business.verification.abstracts.MailActivationService;
import kodlamaio.hrms.business.verification.abstracts.RegisteredCheckService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.entities.concrates.Employers;

@Service
@Lazy
public class EmployersManage implements EmployersService {
	private EmployersDao employersDao;
	private MailActivationService mailActivation;
	private HrmsPersonelCheckService hrmsPersonelCheck;
	private RegisteredCheckService registeredCheckService;
	@Autowired
	public EmployersManage(EmployersDao employersDao, 
			MailActivationService mailActivation, 
			HrmsPersonelCheckService hrmsPersonelCheck,
			RegisteredCheckService registeredCheckService) {
		super();
		this.mailActivation = mailActivation;
		this.hrmsPersonelCheck = hrmsPersonelCheck;
		this.registeredCheckService = registeredCheckService;
		this.employersDao = employersDao;
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>
		(this.employersDao.findAll(),"Success");
	}

	@Override
	public Result add(Employers employers) {
		
	 
		 if (this.mailActivation.mailActivation() == false) {
			return new ErrorResult("Please, Check your mail!!");
		}else if (this.hrmsPersonelCheck.hrmsPersonelCheck() == false) {
			return new ErrorResult("Hrms person didn't aprove you!!");
		}else if(this.registeredCheckService.emailCheck(employers.getMail()) == false){
			return new ErrorResult("Your email is registered!!");
		}else if(this.registeredCheckService.passwordsSame(employers.getPass(), employers.getPassRepeat()) == false){
			return new ErrorResult("Your passes aren't same!!,Please check");
		}else {
			try {
				MessageDigest messageDigestHash = MessageDigest.getInstance("MD5");
				messageDigestHash.update(employers.getPass().getBytes());
				byte messageDigestDizisi[] = messageDigestHash.digest();
				StringBuffer sb16 = new StringBuffer();
				StringBuffer sb32 = new StringBuffer();
				for(int i = 0; i <= messageDigestDizisi.length; i++) {
					sb16.append(Integer.toString((messageDigestDizisi[i] & 0xff) + 0x100,
							16).substring(1));
					sb32.append(Integer.toString((messageDigestDizisi[i] & 0xff) + 0x100,32));
				}
			}
			catch(NoSuchAlgorithmException ex) {
				System.err.println(ex);
			}
			 
				this.employersDao.save(employers);
				return new SuccessResult("Person added");
			}

	}}

