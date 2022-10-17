package Assignment3;

public class Employee extends Person {
  private int empid;
  private double salary;
    public Employee()
    {
    	
    }
	public Employee(int empid, double salary) {
		
		this.empid = empid;
		this.salary = salary;
	}
	public String toString()
	{
		String str;
     str=empid+"\t"+salary;
     return str;
	
	}
  
}
