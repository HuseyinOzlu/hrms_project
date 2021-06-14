package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.business.abstracts.HrmsPersonelCheckService;
import kodlamaio.hrms.business.abstracts.MailActivationService;
import kodlamaio.hrms.business.abstracts.RegisteredCheckService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.entities.concrates.Employers;

@Service
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
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>
		(this.employersDao.findAll(),"Success");
	}

	@Override
	public Result add(Employers employers) {
		
	 
		 if (!this.mailActivation.mailActivation()) {
			return new ErrorResult("Please, Check your mail!!");
		}else if (!this.hrmsPersonelCheck.hrmsPersonelCheck()) {
			return new ErrorResult("Hrms person didn't aprove you!!");
		}else if(this.registeredCheckService.emailCheck(employers.getMail())){
			return new ErrorResult("Your email is registered!!");
		}else {
			this.employersDao.save(employers);
			return new SuccessResult("Person added");
		}

}
/*
	@Override
	public DataResult<List<Employers>> getAll(int id, String name) {
		return new SuccessDataResult<List<Employers>>
		(this.employersDao.getByEmployersIdAndEmployersName(id, name),"Success");
	}

	@Override
	public DataResult<List<Employers>> getByEmplyoresNameAndJobsIdAndJobsName(String name, int jobsId,
			String jobsName) {
		return new SuccessDataResult<List<Employers>>
		(this.employersDao.getByEmployersNameAndJobs_JobsIdAndJobs_Jobs_Name(name, jobsId, jobsName),"Success");
	}
*/
}
