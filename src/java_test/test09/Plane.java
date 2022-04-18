package src.java_test.test09;

abstract public class Plane {
	private String planeName;
	private int fuelSize;

	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {
		fuelSize += fuel;
	}
	
	public abstract void flight(int disthance);
	
	public String toStirng() {
		return String.format("%s \t %d", planeName,fuelSize);
	}
}
