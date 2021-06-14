package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.Employers;

public interface EmployersService {
		
		DataResult<List<Employers>> getAll();
		
	//	DataResult<List<Employers>> getAll(int id, String name);
		
		Result add(Employers employers);
		
	/*	DataResult<List<Employers>> getByEmplyoresNameAndJobsIdAndJobsName
		(String name, int jobsId, String jobsName);
*/
		
}	
