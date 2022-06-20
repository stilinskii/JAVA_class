package src.java_test.test07;

public class Student extends Human{
    private String number;
    private String major;
    
    public Student() {
	// TODO Auto-generated constructor stub
    }

    public Student(String name, int age, int height, int weight,String number, String major) {
	super(name,age,height,weight);
	this.number = number;
	this.major = major;
    }
    
    @Override
    public String toString() {
	
        return super.toString() + String.format("%s\t%s", number,major);
    }
    

}
