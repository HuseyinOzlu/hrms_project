package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.HrmsPersonelService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.HrmsPersonelDao;
import kodlamaio.hrms.entities.concrates.HrmsPersonel;

@Service
public class HrmsPersonelManage implements HrmsPersonelService {
	
	private	HrmsPersonelDao hrmsPersonelDao;
	
	@Autowired
	public HrmsPersonelManage(HrmsPersonelDao hrmsPersonelDao) {
		super();
		this.hrmsPersonelDao = hrmsPersonelDao;
	}
	
	@Override
	public DataResult<List<HrmsPersonel>> getAll() {
		return new SuccessDataResult<List<HrmsPersonel>>
		(this.hrmsPersonelDao.findAll(),"Succed");
	}

	
 
}
