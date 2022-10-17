package assignment1_1;

import java.util.Comparator;

public class Studentid implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int res;
		res= o1.getStudent_id() - o2.getStudent_id();
		return res;
	}
     

}
