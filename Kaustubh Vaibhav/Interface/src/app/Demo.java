package app;


import utility.Circle;
import utility.Rectangle;
import utility.Triangle;


public class Demo {

	public static void main(String[] args) {
		Circle c1= new Circle();
		c1.Drawshape();
		c1.calculateArea();
		
		Rectangle rec= new Rectangle();
		rec.Drawshape();
		rec.calculateArea();
		
		Triangle tri= new Triangle();
		tri.Drawshape();
		tri.calculateArea();
		

	}

}
