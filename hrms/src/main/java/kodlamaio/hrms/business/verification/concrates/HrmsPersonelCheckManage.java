package kodlamaio.hrms.business.verification.concrates;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.verification.abstracts.HrmsPersonelCheckService;

@Service
@Lazy
public class HrmsPersonelCheckManage implements HrmsPersonelCheckService {

	@Override
	public boolean hrmsPersonelCheck() {
		return true;
	}

}
