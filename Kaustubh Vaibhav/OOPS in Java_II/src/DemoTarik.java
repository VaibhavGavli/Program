class Dinank
{ 
	private int day,month,year;
	private static int count;
	
	public Dinank()
	{
		day=1;
		month=10;
		year=2022;
		count++;
	}
	public Dinank(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	
		count++;
	}
	public static void displayCount()
	{
		System.out.println("Count is: "+count);
		
	}
	
}
public class DemoTarik {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
      Dinank d1=new Dinank();
   
      Dinank d2=new Dinank(10,12,2020);
      Dinank d3=new Dinank(12,10,2020);
  
      Dinank d5=new Dinank(1,1,2022);
      Dinank d4=new Dinank();
      Dinank.displayCount();
 
	}

}
