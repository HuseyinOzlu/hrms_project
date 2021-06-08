package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.Employers;

public interface EmployersService {
		
		public DataResult<List<Employers>> getAll();
		Result add(Employers employers);
}	
