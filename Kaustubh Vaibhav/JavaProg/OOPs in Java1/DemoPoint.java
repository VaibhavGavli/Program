class Point
{
    private int x,y;
    public Point()   //No arguments Constructor 
    {
      x=y=5;
     }
    public Point(int x, int y)
    {
      this.x=x;
      this.y=y;
    }
    public void showPoint()
    {
      System.out.println("Point: "+"["+x+","+y+"]");
    }
}

public class DemoPoint
{
   public static void main(String args[])
   {
    Point p1= new Point();   // call for no argument constructor
    p1.showPoint();

     Point p2= new Point(10,20); //parameterised constructor
     p2.showPoint();
    }
 }