package Assignment2;

public class UserRegistration {

	private String name;
	private String userCountry;
	public UserRegistration(String name,String userCountry) {
		super();
		this.name = name;
		this.userCountry = userCountry;
	}
	public UserRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "UserRegistration [name=" + name +", userCountry=" + userCountry + "]";
	}
	
}
	
