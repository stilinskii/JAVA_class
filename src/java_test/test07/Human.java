package src.java_test.test07;

public class Human {
    private String name;
    private int age;
    private int height;
    private int weight;
    
    public Human() {
    }

    public Human(String name, int age, int height, int weight) {
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
    }
    

    @Override
    public String toString() {
        
        return String.format("%s\t%d\t%d\t%d\t" , name,age,height,weight);
    }
    
}
