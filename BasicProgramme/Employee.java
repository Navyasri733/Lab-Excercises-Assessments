package BasicProgramme;

public class Employee {
	String name;
	int id;
	 public double salary;
	
	 
	 Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	public int compareTo(Employee emp) {
		if(salary == emp.salary)
		return 0;
		else if(salary>emp.salary)
		return 1;
		else
			return -1;

}
}