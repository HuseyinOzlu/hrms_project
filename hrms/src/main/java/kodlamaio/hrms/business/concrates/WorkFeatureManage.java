package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.WorkFeatureService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkFeatureDao;
import kodlamaio.hrms.entities.concrates.WorkFeature;

@Service
public class WorkFeatureManage implements WorkFeatureService {
	private WorkFeatureDao workFeatureDao;
	
	@Autowired
	public WorkFeatureManage(WorkFeatureDao workFeatureDao) {
		super();
		this.workFeatureDao = workFeatureDao;
	}


	@Override
	public DataResult<List<WorkFeature>> getAll() {
		return new SuccessDataResult<List<WorkFeature>>
		(this.workFeatureDao.findAll(),"Work Feature Success listed");
	}

}
