class Box
{
 private int height,width,depth;
 public void setBox(int h,int w,int d)   //initializations(setting values)
 {
  height=h;
  width=w;
  depth=d;
  }

public void calculateBox()                   //final output 
  { 
   int volume;
   volume=height*width*depth;
   System.out.println("Volume :"+height+"*"+width+"*"+depth);
   System.out.println("Volume: "+volume);
  }

public void setHeight(int h)                //initializations(setting values)
 {
  height=h;
 }
public void setWidth(int w)                //initializations(setting values)
 {
  width=w;
 }
public void setDepth(int d)                //initializations(setting values)
 {
  depth=d;
 }

}

public class DemoBox
{
 public static void main(String args[])
  {
   Box b1= new Box();
   b1.setHeight(5);
   b1.setWidth(4);
   b1.setDepth(2);
   b1.calculateBox();

   Box b2=new Box();
   b2.setBox(10,20,30);
    b2.calculateBox();

   }
 }
