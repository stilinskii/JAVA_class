package src.java_test.test08;

public class User {
    private String id;
    private String password;
    private String name;
    private int age;
    private char gender;
    private String phone;
	
    public User() {
    }

    public User(String id, String password, String name, int age, char gender, String phone) {
	this.id = id;
	this.password = password;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.phone = phone;
    }
    
    @Override
    public String toString() {
        
        return String.format("%s\t%s\t%s\t%d\t%c\t%s", id,password,name,age,gender,phone);
    }
    
    
    @Override
    public boolean equals(Object obj) {
	if (obj == this) 
	  return true;
	else 
	  return false;
	        
	
    }
    
    public Object clone() {
	//작동이안도미.
	return this.clone();
    }
    
}
