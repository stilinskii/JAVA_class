package src.java_test.test09;

public class PlaneTest {

	
    public static void main(String[] args) {
    	Airplane a = new Airplane("L747",1000);
    	Cargoplane c = new Cargoplane("C40",1000);
    	prn(a,c);
    	
    	System.out.println("100운항");
    	a.flight(100);
    	c.flight(100);
    	prn(a,c);
    	
    	System.out.println("200주유");
    	a.refuel(200);
    	c.refuel(200);
    	prn(a,c);
    }
    
    public static void prn(Plane...planes) {
    	System.out.println("Plane \t fuelSize");
    	System.out.println("-----------------------------");
    	for(Plane p:planes) {
    		System.out.println(p.toStirng());
    	}
    	System.out.println();
    	
    }

}
