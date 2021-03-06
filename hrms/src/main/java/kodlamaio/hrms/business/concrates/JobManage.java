package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.business.abstracts.JobsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobsDao;
import kodlamaio.hrms.entities.concrates.Jobs;


@Service
@Lazy
public class JobManage implements JobsService {

	private JobsDao jobsDao;
	
	@Autowired
	public JobManage(JobsDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}
	
	@Override
	public DataResult<List<Jobs>> getAll() {
		return new SuccessDataResult<List<Jobs>>(this.jobsDao.findAll(),
				"Data Listed");
	}

	@Override
	public Result add(Jobs jobs) {
		this.jobsDao.save(jobs);
		return new SuccessResult("Success");
	}

	@Override
	public DataResult<List<Jobs>> getByIsJobOpenTrue() {
		return new SuccessDataResult<List<Jobs>>
		(this.jobsDao.getByIsJobOpenTrue(),"Success Open Jobs Data Listed");
	}

	@Override
	public DataResult<List<Jobs>> getByIsJobOpenTrueAndEmployers_CompanyName(String companyName) {
		return new SuccessDataResult<List<Jobs>>
		(this.jobsDao.getByIsJobOpenTrueAndEmployers_CompanyName(companyName),
				"Succes Open Jobs And Company Name Listed");
	}

	@Override
	public DataResult<List<Jobs>> getByIsJobOpenTrueAndDateLessThanEqual(int date) {
		return new SuccessDataResult<List<Jobs>>
		(this.jobsDao.getByIsJobOpenTrueAndDateLessThanEqual(date),
				"Success Open Jobs And Date Listed");
	}



	

}
