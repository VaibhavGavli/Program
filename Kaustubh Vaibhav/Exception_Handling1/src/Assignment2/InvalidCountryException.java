package Assignment2;

public class InvalidCountryException extends Exception{
	
		private String msg;

		 public InvalidCountryException()
		{
			msg="User is not From India";
		}
		public String getMessage() {
			return msg;
		}
	 
	}






