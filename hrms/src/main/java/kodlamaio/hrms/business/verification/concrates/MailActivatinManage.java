package kodlamaio.hrms.business.verification.concrates;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.verification.abstracts.MailActivationService;

@Service
@Lazy
public class MailActivatinManage implements MailActivationService {

	@Override
	public boolean mailActivation() {
		return true;
	}
	
}
