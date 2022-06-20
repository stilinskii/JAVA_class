package src.java_test.test09.test09_MVC;

import java.util.List;


public class PlaneController {
	private PlaneView view = new PlaneView();
	
	public PlaneController() {
		// TODO Auto-generated constructor stub
	}
	
	public void refuel(PlaneModel p,int fuel) {
		p.setFuelsize(p.getFuelsize()+fuel);
	}
	
	public void flight(PlaneModel p,int distance) {
		if(p instanceof Cargoplane2) {
			p.setFuelsize(p.getFuelsize()-(distance/10)*50);
		}else if(p instanceof Airplane2) {
			p.setFuelsize(p.getFuelsize()-(distance/10)*30);
		}
		
	}
	
	public void show(List<PlaneModel> pList) {
		view.prn(pList);
	}
}
