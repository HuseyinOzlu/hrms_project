package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobsDao;
import kodlamaio.hrms.entities.concrates.Jobs;


@Service
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



	

}
