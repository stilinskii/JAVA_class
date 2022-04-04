package src.part05;

public class Dog extends Pet implements Print{
	public Dog() {
	}
	
	public Dog(String name,boolean gender,int age) {
		super(name,gender,age);
	}
	
	public String play() {
		return "사람을 좋아함";
	}

	@Override
	public void toPrint() {
		String g = gender ? "남":"여";
		System.out.printf("강아지  %s  %d살  %s  %s\n", toString(),age,g,play() );
	}
}
