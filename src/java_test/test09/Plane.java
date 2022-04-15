package src.java_test.test09;

abstract public class Plane {
    private String planeName;
    private int fuelSize;
    
    public Plane() {
	// TODO Auto-generated constructor stub
    }

    public Plane(String planeName, int fuelSize) {
	this.planeName = planeName;
	this.fuelSize = fuelSize;
    }
    
    
    public void setFuelSize(int fuelSize) {
        this.fuelSize = fuelSize;
    }

    public int getFuelSize() {
        return fuelSize;
    }

    public void refuel(int fuel) {
	
	fuelSize += fuel;
    } 
    
    public void flight(int distance) {}
    
    public String toString() {
	return String.format("%s\t\t%d", planeName,fuelSize);
    }
    
    
    
}
