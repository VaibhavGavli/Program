package Assignment1;


public class TooLongException extends Exception {
	private String pass,msg;
	public TooLongException()
	{
		msg="Password should  be lesser than 12 digit";
	}
	public String getMessage()
	{
		return msg;
	}
}

