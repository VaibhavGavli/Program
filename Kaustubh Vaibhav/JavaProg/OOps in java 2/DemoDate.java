class Date
{
  private int day,month,year;
  private char ch;
  public void setDate(int d, int m, int y)
  {
   day=d;
   month=m;
   year=y;
   
  }

 public void showDate()
 {
  System.out.println("Date: "+day+"/"+month+"/"+year);
 }

 
  public void showDate(char ch)
 {
   
   System.out.println("Date: "+day+ch+month+ch+year);
 }   
}

 public class DemoDate
 {
  public static void main(String args[])
  {
   Date d1= new Date();
   d1.setDate(10,5,2000);
   d1.showDate();


    Date d2= new Date();
    d2.setDate(10,6,2000);
    d2.showDate('-'); 
   }
}  