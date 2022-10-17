package app;

import utility.Employee;
import utility.Manager;

public class Demo {

	public static void main(String[] args) {
	Employee e1= new Employee(101,"Radha",50000);
	System.out.println(e1.display());
	Manager m1= new Manager(102,"Krishna",100000,2000,500);
	System.out.println(m1.display());
    
	}

}
