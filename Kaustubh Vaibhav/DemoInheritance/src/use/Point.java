package use;

public class Point {
private int x1,y1,x2,y2;

public Point() {
	super();
}

public Point(int x1, int y1, int x2, int y2) {
	super();
	this.x1 = x1;
	this.y1 = y1;
	this.x2 = x2;
	this.y2 = y2;
}


public String toString()
{
	String str;
	str="point :["+x1+","+y1+","+x2+","+y2+"]";
	return str;
}
}
