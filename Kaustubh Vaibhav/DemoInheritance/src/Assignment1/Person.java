package Assignment1;

public class Person {
	private String name,address,pincode;
	 public Person()
	 {
		 
	 }
	public Person(String name, String address, String pincode) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
	}
	public String display()
	{
		return name+"\t"+address+"\t"+pincode;
	}

}
