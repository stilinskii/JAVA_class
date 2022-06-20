package src.part05;

public class Cat extends Pet implements Print{
	
	
	
	public Cat() {
	}
	
	
	
	public Cat(String name,boolean gender,int age) {
		super(name,gender,age);
	}
	
	public String hunt() {
		return "사냥을 좋아함";
	}



	@Override
	public void toPrint() {
		String g = gender ? "남":"여";
		System.out.printf("고양이  %s  %d살  %s  %s\n", toString(),age,g,hunt() );
	}
}
