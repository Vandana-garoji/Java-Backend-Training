
public class CustomException extends Exception{
	String errorMessage;
	
	public  CustomException(String s) {
	    this.errorMessage = s;
	}

	public String getErrorMessage() {
	    return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
	    this.errorMessage = errorMessage;
	}

	
}
