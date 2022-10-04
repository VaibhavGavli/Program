class Box
 {  
   private int height,width,depth;
   public void setBox(int h,int w,int d)
   {
     height=h;
     width=w;
     depth=d;
    }
   public void setHeight(int h)
   {
     height=h;
    }
   public int getHeight()
    {
      return height;
     }

    public void setWidth(int w)
     {
       width=w;
      }
     public int getWidth()
      {
       return width;
       }
   
    public void setDepth(int d)
     {
        depth=d;
      }
     public int getDepth()
      {
        return depth;
       }

    public void showBox()
    {
       int vol;
       vol=height*width*depth;
      System.out.println("volume :"+height+"*"+width+"*"+depth);
      System.out.println("volume :"+vol);
    }
}
  
  public class CheckBox
   {
    public static void main(String args[])
     {
       Box b1=new Box();
       b1.setBox(10,20,50);
       b1.showBox();

       
       
       int varkontapan = b1.getDepth();
       System.out.println(" Vaibhavvvvvv "+varkontapan);
        //b1.showBox();
     }
}
     
    