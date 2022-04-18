package src.java_test.test10;

abstract public class Employee {
    private String name;
    private int number;
    private String department;
    private int salary;
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int number, String department, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
    
    abstract public double tax();

    
    public String toString() {
		return String.format("%s \t %s \t %d \t", name,department,salary );
	}
	
    
    
    
    
    //getter setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
    
    
    
    
}
