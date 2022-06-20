package src.java_test.test09;

public class Cargoplane extends Plane{
  
    public Cargoplane() {
	}
    
    public Cargoplane(String planeName, int fuelSize) {
    	super(planeName,fuelSize);
    }
    
    
    @Override
    public void flight(int disthance) {
    	super.refuel(-((disthance/10)*50));
    }
    
}
