package kodlamaio.hrms.business.concrates;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.MailActivationService;

@Service
public class MailActivatinManage implements MailActivationService {

	@Override
	public boolean mailActivation() {
		return true;
	}
	
}
