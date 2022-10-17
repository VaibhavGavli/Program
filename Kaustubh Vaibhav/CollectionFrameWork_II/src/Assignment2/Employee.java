package Assignment2;

public class Employee implements Comparable <Employee> {

private int eid;
private String name;
private String salary;

public Employee() {
	super();
}
public Employee(int eid, String name, String salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary +  "]";
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}

@Override
public int compareTo(Employee e) {
	int res;
	res=this.salary.compareTo(e.salary);
	return res;
	
	
}




}
