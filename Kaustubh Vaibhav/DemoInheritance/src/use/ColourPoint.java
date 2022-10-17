package use;

public class ColourPoint extends Point {
 private String Colour;
 
 public static String []Colours;
 
 static
 {
	 Colours=new String[5];
	 Colours[0]="Green";
	 Colours[1]="Red";
	 Colours[2]="Blue";
	 Colours[3]="Black";
	 Colours[4]="Yellow";
 }

public ColourPoint() {
	super();
	Colour="White";
}

public ColourPoint(int x1,int x2,int y1,int y2 ,String colour) {
	super(x1,x2,y1,y2);
	this.Colour = colour;
	int flag=0;
	for(int i=0;i<5;i++)
	{
		
		if(colour.equals(Colours[i]))
		{
			flag=1;
			this.Colour=colour;
			break;

		}
		else
			flag=0;
		this.Colour="White";

	}
	if(flag==1) {
		 this.Colour=Colour;
	 }
	 else if(flag==0)
	 {
		 this.Colour="White";
	 }
}
	public String toString()
	{
		String str;
		str=super.toString()+"Colour :"+Colour;
		return str;
		
	}


 

}

