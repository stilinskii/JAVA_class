package src.java_test.test10;

public class Sales extends Employee implements Bonus{
    public Sales() {
    }
    
    public Sales(String name,int number,String department,int salary) {
    	super(name,number,department,salary);
    	
    }
    
    public double tax() {
 	double tax = super.getSalary()*0.13;
 	return tax;
     }

    @Override
    public void incentive(int pay) {
	setSalary((int)(getSalary()+(pay*1.2)));
    }
    

//    
//    @Override
//    public String toString() {
//        
//        return super.toString() + tax();
//    }
    
}
