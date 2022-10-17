package utility;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	
	public Employee()
	{
		
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	/*public static void fun()
	{
	 System.out.println("/");
	}*/
	public String display()
	{
		String str;
		str= "Employee id:\t"+eid+"   Name :"+name+"     Salary :"+salary;
		return str;
	}
    
}
