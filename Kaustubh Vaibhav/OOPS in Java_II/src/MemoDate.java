class Tarik
{
	private int day,month,year;
	public Tarik()
	{
		day=month=5;
		year=2022;
	}
	public Tarik(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
		
	}
	public Tarik(Tarik obj)
	{
		this.day=obj.day;
		this.month=obj.month;
		this.year=obj.year;
	}
	public void showTarik()
	{
		System.out.println("Date: "+day+"/"+month+"/"+year);
	}
	
	public void showTarik(char ch)
	{
		System.out.println("Date: "+day+ch+month+ch+year);
	}
}
public class MemoDate{

	public static void main(String[] args) {
	 Tarik d1= new Tarik();
	 d1.showTarik();
	 
	 Tarik d2= new Tarik();
	 d2.showTarik('-');
     
	  
	 Tarik d3= new Tarik(10,5,2022);
     d3.showTarik();
     d3.showTarik('-');
     
     Tarik d4= new Tarik(d2);
     d4.showTarik();
     
	}

}
