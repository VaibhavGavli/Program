package Assignment2;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Name: ");
			String name=sc.next();
			System.out.println("Enter the Country: ");
			String Countryname=sc.next();
			if(!Countryname.equals("India")) {
				throw new InvalidCountryException();
			}
			else {
				UserRegistration u1= new UserRegistration(name,Countryname);
				System.out.println("User Registration successful:\n"+u1);
			}
		}
			catch(InvalidCountryException e)
			{
				System.out.println(e.getMessage());
			}
		}


	}

