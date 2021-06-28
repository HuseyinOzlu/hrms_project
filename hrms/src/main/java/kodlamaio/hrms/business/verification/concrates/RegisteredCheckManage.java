package kodlamaio.hrms.business.verification.concrates;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.verification.abstracts.RegisteredCheckService;
import kodlamaio.hrms.core.dataAccess.UsersDao;
import kodlamaio.hrms.core.entities.Users;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.dataAccess.abstracts.UnemployedDao;
import kodlamaio.hrms.entities.concrates.Employers;
import kodlamaio.hrms.entities.concrates.Unemployed;

@Service
public class RegisteredCheckManage implements RegisteredCheckService {
	
	EmployersDao employersDao;
	UnemployedDao unemployedDao;
	UsersDao userDao;

	@Autowired
	public RegisteredCheckManage(EmployersDao employersDao, UnemployedDao unemployedDao,UsersDao userDao) {
		super();
		this.employersDao = employersDao;
		this.unemployedDao = unemployedDao;
		this.userDao = userDao;
	}

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
		List<Unemployed> unemployedIn = this.unemployedDao.findAll();
		for(Unemployed iNumber : unemployedIn) {
			if(iNumber.getIdentityNumber().equals(identityNum)) {
				return false; 
		}}
		return true;
	}

	@Override
	public boolean passwordsSame(String userPass, String repeatPass) {
		List<Users> userPassword = this.userDao.findAll();
		for(Users pass : userPassword) {
			if(pass.getPass() == pass.getPassRepeat()) {
				return false;
			}
		}
		return true;
	}

}
