package src.java_test.test09.test09_MVC;

public class PlaneModel {
	private String PlaneName;
	private int fuelsize;
	
	public PlaneModel() {
		// TODO Auto-generated constructor stub
	}

	public PlaneModel(String planeName, int fuelsize) {
		super();
		PlaneName = planeName;
		this.fuelsize = fuelsize;
	}
	

	public String getPlaneName() {
		return PlaneName;
	}

	public void setPlaneName(String planeName) {
		PlaneName = planeName;
	}

	public int getFuelsize() {
		return fuelsize;
	}

	public void setFuelsize(int fuelsize) {
		this.fuelsize = fuelsize;
	}
	
	
	
}
