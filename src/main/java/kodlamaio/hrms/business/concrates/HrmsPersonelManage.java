package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.HrmsPersonelService;
import kodlamaio.hrms.dataAccess.abstracts.HrmsPersonelDao;
import kodlamaio.hrms.entities.concrates.HrmsPersonel;
import lombok.Data;

@Data
@Service
public class HrmsPersonelManage implements HrmsPersonelService {
	private	HrmsPersonelDao hrmsPersonelDao;
	
	@Autowired
	public HrmsPersonelManage(HrmsPersonelDao hrmsPersonelDao) {
		super();
		this.hrmsPersonelDao = hrmsPersonelDao;
	}
	
	@Override
	public List<HrmsPersonel> getAll() {
		return null;
	}

	
 
}
