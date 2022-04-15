package src.java_test.test09;

public class Cargoplane extends Airplane{
    public Cargoplane() {
	// TODO Auto-generated constructor stub
    }
    public Cargoplane(String planeName,int fuelSize) {
	super(planeName,fuelSize);
    }
    
    @Override
    public void flight(int distance) {
	
	double a = getFuelSize() - distance*5;
	setFuelSize((int)a);
      
    }
    
    
}
