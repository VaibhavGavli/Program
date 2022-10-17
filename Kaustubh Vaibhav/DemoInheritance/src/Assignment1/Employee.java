package Assignment1;

public class Employee extends Person {
  private int empid;
  private double salary;
    public Employee()
    {
    	
    }
	public Employee(String name, String address, String pincode,int empid, double salary) {
		super(name,address,pincode);
		this.empid = empid;
		this.salary = salary;
	}
	public String display()
	{
		String str;
     str=super.display()+"\t"+empid+"\t"+salary;
     return str;
	
	}
  
}
