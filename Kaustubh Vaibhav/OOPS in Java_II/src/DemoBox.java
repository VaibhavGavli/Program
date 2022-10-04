class Box
{
	private int height,width,depth;
	public Box()
	{
		height=5;
		width=10;
		depth=3;
		
	}
	public Box(int h,int w,int d)
	{
		height=h;
		depth=w;
		width=d;
	}
	public Box(Box obj)
	{
		this.height=obj.height;
		this.depth=obj.depth;
		this.width=obj.width;
	}
	public void showBox()
	{
		int vol=height*width*depth;
		System.out.println("Volume :"+height+"*"+width+"*"+depth);
		System.out.println("Volume :"+vol);
	}
}

public class DemoBox {
 
	public static void main(String args[])
	{
	Box b1=new Box();
	b1.showBox();
	Box b2=new Box(5,7,5);
	 b2.showBox();
	 Box b3=new Box(b2);
	 b3.showBox();
	 
	
}
}
