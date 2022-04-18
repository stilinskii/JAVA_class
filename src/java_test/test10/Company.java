package src.java_test.test10;

import java.util.Arrays;

public class Company {
    
    
    public static void main(String[] args) {
	Employee[] employees = new Employee[2];
	employees[0] =new Secretary("Hilery",1,"secretary",800);
	employees[1] = new Sales("Clinten",1,"sales",1200);
	
	//이게 여기있는게 너무 싫어
//	System.out.println("name    department    salary");
//	System.out.println("-------------------------------------------");
	
	prn(employees);
	
	System.out.println("인센티브  100 지급");
	prnWithIncentiveAndTax(employees);
	
    }
    
    
    
    
    
    public static void prn(Employee...employees) {
    	System.out.println("name    department    salary");
    	System.out.println("-------------------------------------------");
        Arrays.stream(employees, 0, employees.length).forEach(System.out::println);
        System.out.println();
    }
    
    public static void prnWithIncentiveAndTax(Employee...employees) {
    	System.out.println("name \t department \t salary \t tax");
    	System.out.println("--------------------------------------------");
    	for(Employee e:employees) {
    		if(e instanceof Secretary) {
    			((Secretary) e).incentive(100);
    			System.out.println(e.toString()+e.tax());
    		}else {
    			((Sales) e).incentive(100);
    			System.out.println(e.toString()+e.tax());
    		}
    		
    			
    	}
    	
    }

}
