package utility;

public class Manager extends Employee {
	private double allowance ,incentive;
	
	
	public Manager()
	{
		
	}


	public Manager(int eid,String name,double salary,double allowance, double incentive) {
		super(eid,name,salary);
		this.allowance = allowance;
		this.incentive = incentive;
	}
	public String display()
	{
		String str=super.display()+"\n\tAllowance :"+allowance+"\n\tIncentive :"+incentive;
		return str;
	}

}
