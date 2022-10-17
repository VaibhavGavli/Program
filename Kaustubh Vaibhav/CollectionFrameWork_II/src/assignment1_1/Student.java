package assignment1_1;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int student_id;
	private String name;
	private String city;
	private double percentage;
	
	public Student() {
		
	}

	public Student(int student_id, String name, String city, double percentage) {
		this.student_id = student_id;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	

	
	


	public String toString() {
		return "Student_id=" + student_id + ", name=" + name + ", city=" + city + ", percentage=" + percentage;
	}

	

	
	
	

	@Override
	public int compareTo(Student s) {
		int res;
		res=this.student_id - s.student_id;
		return 0;
	}

	



	
	
	
	
	
	
	

}
