package kodlamaio.hrms.business.concrates;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.HrmsPersonelCheckService;

@Service
@Lazy
public class HrmsPersonelCheckManage implements HrmsPersonelCheckService {

	@Override
	public boolean hrmsPersonelCheck() {
		return true;
	}

}
