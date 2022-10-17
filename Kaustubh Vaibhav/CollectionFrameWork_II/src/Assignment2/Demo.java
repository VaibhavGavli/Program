package Assignment2;

import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		Set<Employee>Emp=new TreeSet<>();
		Emp.add(new Employee(101,"Soham","200000"));
		Emp.add(new Employee(102,"vaibhav","200"));
		Emp.add(new Employee(103,"prince","2000"));
		Emp.add(new Employee(104,"kaushtub","20000"));
		Emp.add(new Employee(105,"Radhe","20"));
		
          for(Employee Emps:Emp)
          {
        	  System.out.println(Emps);
          }
	}

}
