package src.java_test.test09;

public class Airplane extends Plane{
    public Airplane() {
        // TODO Auto-generated constructor stub
    }
    
    public Airplane(String planeName,int fuelSize) {
	super(planeName,fuelSize);
    }
    
    @Override
    public void flight(int distance) {
        //일정거리  만큼 운항, 연료감소 10 운항시 연료 30 감소
	
	//fuelSize -= distance*3;
	double a = getFuelSize() - distance*3;
	setFuelSize((int)a);
    }
    
    
}
