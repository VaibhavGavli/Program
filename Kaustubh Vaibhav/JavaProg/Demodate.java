class Date
{
private int day,month,year;
public void set Date(int d,int m,int y)
 {  
    day =d;
    month =m;
    year =y;
 }
 public void show Date()
  {
   System.out.println("Date :"+day+"/"+month+"/"+year);
  }
 public void set Day(int d)
  {
   day=d;
  }
 public void set Month(int m)
  {
   month=m;
  }
 public void set year(int y)
  {
   year=y;
  }
} 
public class Demodate
{
public static void main(String args[])
 {
  Date d1=newDate();
   d1.set Date(3,10,2022);
    d1.showDate();
  }
}