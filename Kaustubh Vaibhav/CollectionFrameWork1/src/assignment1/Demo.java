package assignment1;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo {
      
	public static void main(String[] args) {
	 LinkedList<String> names= new LinkedList<>();
	 int choice;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the choice: ");
	 do
	 {
		 System.out.println("1.  Accept");
		 System.out.println("2.Display");
		 System.out.println("3. search");
		 System.out.println("4.Sort ");
		 System.out.println("Enter your choice");
		 choice=sc.nextInt();
		 
		switch(choice)
		{
		case 1:
			System.out.println("enter names or any string");
			String s1=sc.next();
			names.add(s1);
		    break;
		     
		case 2:
			System.out.println(names);
			break;
			
		case 3:
			System.out.println("ente name to search ");
			 String key=sc.next();
			 if(names.contains(key))
			 {
			 
				 System.out.println("Available");
				 System.out.println("Index is :"+names.indexOf(key));
			 }
			 
			 
			 else
				System.out.println("Not Available"); 
			 break;
			 
		case 4:
			Collections.sort(names);
			System.out.println(names);
			
		
	
					
		
		}
		 
	 }while(choice!=0);
	
	 
	    
		 
 
	 
	 
	 
	 

	}

}
