package src.java_test.test10;

public class Secretary extends Employee implements Bonus {
    public Secretary() {
    }
    
    public Secretary(String name,int number,String department,int salary) {
	super(name,number,department,salary);
	
    }
    
    public double tax() {
	double tax = super.getSalary()*0.1;
	return tax;
    }

    @Override
    public void incentive(int pay) {
	int d = (int)(getSalary()+(pay*0.8));
	setSalary(d);
    }
    
    
    
//    @Override
//    public String toString() {
//        
//        return String.format("%-5s\t%-10s\t%-5d",name,department,salary); + tax();
//    }
}
