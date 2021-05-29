package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.entities.concrates.Employers;
import lombok.Data;

@Data
@Service
public class EmployersManage implements EmployersService {
	
	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManage(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public List<Employers> getAll() {
		return null;
	}

}
