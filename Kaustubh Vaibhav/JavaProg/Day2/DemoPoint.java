class Point
{
  private int x,y;
  public void setPoint(int m,int n)
   {
    x=m;
    y=n;
   }
  public void setX(int m)
   {
    x=m;
   }
  public void setY(int n)
   {
    y=n;
    }
  public void showPoint()
  {
   System.out.println("Co-ordinates ["+x+","+y+"]");
  }
}
public class DemoPoint
 {
  public static void main(String args[])
  {
    Point p1=new Point();
     p1.setPoint(10,20);
     p1.showPoint();

    Point p2= new Point();
    p2.setX(10);
    p2.setY(14);
    p2.showPoint();

  }
}
