package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.Unemployed;

public interface UnemployedService {
		DataResult<List<Unemployed>> getAll();
		Result add(Unemployed unemployed);
}
