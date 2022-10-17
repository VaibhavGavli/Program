package assignment1_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Demoapp {

	public static void main(String[] args) {
		
		List<Student>stud=new ArrayList<Student>();
		 
		stud.add(new Student(10,"Kaustubh","Pen",81.09));
		stud.add(new Student(5,"Prince","Nagpur",93));
		stud.add(new Student(18,"Aditya","Kolhapur",82));
		stud.add(new Student(12,"Swapnil","Shirdi",55));
		
	    Collections.sort(stud);
	    for(Student studs:stud)
	    {
	    	System.out.println(stud);
	    }
        
	   
	}

}
