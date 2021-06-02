package kodlamaio.hrms.core.utilities.results;

public class Result {
	private boolean success;
	private String messagge;
	
	public Result(boolean success) {
		this.success = success;
	}
	
	public Result(boolean success, String message) {
		this(success);
		this.messagge = message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return this.messagge;
	}
}
