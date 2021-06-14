package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.RegisteredCheckService;
import kodlamaio.hrms.business.abstracts.UnemployedService;
import kodlamaio.hrms.core.utilities.adapters.MernisService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UnemployedDao;
import kodlamaio.hrms.entities.concrates.Unemployed;

@Service
@Lazy
public class UnemployedManage implements UnemployedService {

	private UnemployedDao unemployedDao;
	
	private MernisService mernisService;
	
	private RegisteredCheckService registeredCheckService;
	@Autowired
	public UnemployedManage(UnemployedDao unemployedDao,
			 RegisteredCheckService registeredCheckService
			 ,MernisService mernisService) {
		super();
		this.unemployedDao = unemployedDao;
		this.registeredCheckService = registeredCheckService;
		this.mernisService = mernisService;
	}
	
	@Override
	public DataResult<List<Unemployed>> getAll() {
		return new SuccessDataResult<List<Unemployed>>
		(this.unemployedDao.findAll(),"Data listed");
	}
	@Override
	public Result add(Unemployed unemployed) {
		if(this.mernisService.mernisCheck()) {
			return new ErrorResult("The error to Mernis check!!");
		}else if(this.registeredCheckService.emailCheck(unemployed.getMail())) {
			return new ErrorResult("Email is already added!!");
		}else if(this.registeredCheckService.identityNumCheck(unemployed.getIdentityNumber())) {
			return new ErrorResult("TC, identity number is error");
		}else{this.unemployedDao.save(unemployed);
		return new SuccessResult("You joined, Welcome ;)");
	}}

}
