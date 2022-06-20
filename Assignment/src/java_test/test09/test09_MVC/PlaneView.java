package src.java_test.test09.test09_MVC;

import java.util.List;

public class PlaneView {
	public void prn(List<PlaneModel> pList) {
		System.out.println("Plane        fuelSize");
		System.out.println("-------------------------");
		pList.forEach(e -> System.out.printf("%-4s            %-4d\n",e.getPlaneName(),e.getFuelsize()));
		
	}
}
