package Assignment1;

import java.util.Scanner;

public class Demo {
	

	public static void main(String[] args)  {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Password: ");
			String pass = sc.next();
			if(pass.length()>12)
				throw new TooLongException();
			if(pass.length()<8)
				throw new TooShortException();
		}
		catch(TooLongException e) {
			System.out.println(e.getMessage());
		}
		catch(TooShortException a) {
			System.out.println(a.getMessage());
	}

	}
}
