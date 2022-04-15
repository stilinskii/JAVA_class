package src.java_test.test10;

public class Company {
    
    
    public static void main(String[] args) {
	Employee[] employees = new Employee[2];
	Secretary sc = new Secretary("Hilery",1,"secretary",800);
	employees[0] = sc;
	Sales se = new Sales("Clinten",1,"sales",1200);
	employees[1] = se;
    
	System.out.println("name    department    salary");
	System.out.println("------------------------------------");
	for(Employee data:employees) {
	    System.out.println(data.toString());
	}
	
	System.out.println("인센티브  100 지급");
	System.out.println("name    department    salary     tax");
	System.out.println("-------------------------------------------");
	
	sc.incentive(100);
	se.incentive(100);
	for(Employee data:employees) {
	    System.out.println(data.toString() + data.tax());
	}
	
	
    }

}
