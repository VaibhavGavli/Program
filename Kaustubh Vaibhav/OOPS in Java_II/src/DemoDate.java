class Date
{
	private int day,month,year;
	/*public void setDate(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
		
	}*/
	public Date()
	{
		day=month=1;
		year=2022;
	}
	public Date(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}
	public Date(Date obj)
	{
		this.day=obj.day;
		this.month=obj.month;
		this.year=obj.year;
	}
	public void showDate()
	{
	  System.out.println("Date :"+day+"/"+month+"/"+year );
	}
	
}

public class DemoDate {
	

	public static void main(String[] args) {
		Date d1=new Date();
		 d1.showDate();
	    Date d2=new Date(4,10,2022);
	     d2.showDate();
	     Date d3=new Date(d2);
	      d3.showDate();

	}

}
