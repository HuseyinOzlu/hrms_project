package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concrates.HrmsPersonel;

public interface HrmsPersonelService {
		DataResult<List<HrmsPersonel>> getAll();
}
