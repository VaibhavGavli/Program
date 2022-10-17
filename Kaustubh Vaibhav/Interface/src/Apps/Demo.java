package Apps;

import Ass2.MyNumber;

public class Demo {

	public static void main(String[] args) {
		MyNumber n1 = new MyNumber();
		System.out.println(n1.isOdd(7));
		System.out.println(n1.isEven(10));
		System.out.println(n1.isPrime(11));
	  
		MyNumber n2= new MyNumber();
		System.out.println(n2.calFactorial(5));
		
	}

}
