package src.java_test.test09;

public class Airplane extends Plane {

	public Airplane() {
		// TODO Auto-generated constructor stub
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName,fuelSize);
	}

	@Override
	public void flight(int disthance) {
		super.refuel(-((disthance/10)*30));
	}

}
