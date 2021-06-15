package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.Jobs;

public interface JobsService {
	DataResult<List<Jobs>> getAll();
	Result add(Jobs jobs);
	
	DataResult<List<Jobs>> getByIsJobOpenTrue();
	DataResult<List<Jobs>> getByIsJobOpenTrueAndEmployers_CompanyName(String companyName);
	DataResult<List<Jobs>> getByIsJobOpenTrueAndDateLessThanEqual(int date);
}
