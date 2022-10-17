package Assignment3;
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
	public String toString()
	{
	  return +day+"/"+month+"/"+year ;
	}
	
}




