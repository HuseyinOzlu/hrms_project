package kodlamaio.hrms.business.concrates;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.RegisteredCheckService;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.dataAccess.abstracts.UnemployedDao;
import kodlamaio.hrms.entities.concrates.Employers;
import kodlamaio.hrms.entities.concrates.Unemployed;
import kodlamaio.hrms.entities.concrates.Users;

@Service
public class RegisteredCheckManage implements RegisteredCheckService {
	
	EmployersDao employersDao;
	UnemployedDao unemployedDao;
	Employers employers;
	Users user;
	Unemployed unemployed;
	
	@Override
	public boolean emailCheck(String email) {
		List<Employers> employerMail = employersDao.findAll();
		for(Employers employersM : employerMail) {
			if(employersM.getMail().equals(email)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean identityNumCheck(String identityNum) {
		List<Unemployed> unemployedIn = unemployedDao.findAll();
		for(Unemployed iNumber : unemployedIn) {
			if(iNumber.getIdentityNumber().equals(identityNum)) {
				return false; 
		}}
		return true;
	}

}
