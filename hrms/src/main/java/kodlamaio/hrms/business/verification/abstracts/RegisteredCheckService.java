package kodlamaio.hrms.business.verification.abstracts;


public interface RegisteredCheckService {
	boolean identityNumCheck(String identityNum);
	boolean emailCheck(String email);
	boolean passwordsSame(String userPass, String repeatPass);
	
}
