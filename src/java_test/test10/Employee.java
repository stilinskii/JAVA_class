package src.java_test.test10;

abstract public class Employee {
    private String name;
    private int number;
    private String department;
    private int salary;
    
    public Employee() {
    }

    public Employee(String name, int number, String department, int salary) {
	this.name = name;
	this.number = number;
	this.department = department;
	this.salary = salary;
    }
    
    public double tax() {
	return 0;
    }
    
    public String toString() {
	return String.format("%-5s\t%-10s\t%-5d", name,department,salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
