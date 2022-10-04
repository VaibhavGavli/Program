class Student
{
	private int rno;
	private String name;
	private double avg;
	private static  int count;
	public Student()
	{
	  
	   name=null;
	   avg=6.5;
	  rno=++count;
	}
	public Student(String name)
	{
		this.name=name;
		this.rno=rno;
		this.avg=avg;
	 rno=++count;	
	}
	public Student(String name,double avg)
	{
		this.name=name;
		this.avg=avg;
	  rno=++count;
	}
	public  void displayCount()
	{
	System.out.println("Rno: "+rno+" Name: "+name+" Avg: "+avg);
	}
}
public class DemoStudent {

	public static void main(String[] args) {
	
      Student s1=new Student();
      Student s2= new Student("geeta");
      Student s3= new Student("Seeta",69);
      Student s4= new Student("Nitin");
      Student s5= new Student("Ram");
      s1.displayCount();
      s2.displayCount();
      s3.displayCount();
      s4.displayCount();
      s5.displayCount();
	}

}
