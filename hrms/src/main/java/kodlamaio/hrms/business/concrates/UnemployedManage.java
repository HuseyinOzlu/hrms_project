package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UnemployedService;
import kodlamaio.hrms.dataAccess.abstracts.UnemployedDao;
import kodlamaio.hrms.entities.concrates.Unemployed;
import lombok.Data;

@Data
@Service
public class UnemployedManage implements UnemployedService {

	private UnemployedDao unemployedDao;
	
	@Autowired
	public UnemployedManage(UnemployedDao unemployedDao) {
		super();
		this.unemployedDao = unemployedDao;
	}
	
	@Override
	public List<Unemployed> getAll() {
		return null;
	}

}
