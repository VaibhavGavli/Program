package Assignment1;

public class TooShortException extends Exception{
	private String pass,msg;
	public TooShortException()
	{
		msg="Password should be greater than 8 digit";
	}
	public String getMessage()
	{
		return msg;
	}
}

