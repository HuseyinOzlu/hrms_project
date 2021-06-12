package kodlamaio.hrms.business.abstracts;


public interface RegisteredCheckService {
	boolean identityNumCheck(String identityNum);
	boolean emailCheck(String email);
	
}
