package src.part05;

public class Pet {
	private String name;
	public boolean gender;
	public int age;

	
	public Pet() {
		
	}

	public Pet(String name, boolean gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
	

	
	public String toString() {
		return name;
	}
	
}
