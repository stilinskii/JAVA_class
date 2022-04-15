package src.java_test.test13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) throws AmountNotEnough {
    	Map<String, Inventory> map = new HashMap<String, Inventory>();
		
		Date d1 = new GregorianCalendar(2016,2,15).getTime();
		Date d2 = new GregorianCalendar(2016,2,25).getTime();
		Date d3 = new GregorianCalendar(2016,1,23).getTime();

		Inventory o1 = new Inventory("삼성 갤럭시S7",d1,30);
		Inventory o2 = new Inventory("LG G5",d2,20);
		Inventory o3 = new Inventory("애플 아이패드 Pro",d3,15);
		
		map.put(o1.getProductName(), o1);
		map.put(o2.getProductName(), o2);
		map.put(o3.getProductName(), o3);
		
		for(Map.Entry<String, Inventory> m : map.entrySet()) {
			System.out.println(m.getValue());
		}
		
		System.out.println("출고 수량 10 적용시 ----------------------------------------------------------");
		
		Inventory[] inventory = new Inventory[map.size()];
		inventory[0] = map.get(o1.getProductName());
		inventory[1] = map.get(o2.getProductName());
		inventory[2] = map.get(o3.getProductName());
		
	
		Date d = new GregorianCalendar(2016,4,28).getTime();
		for(int i = 0;i<inventory.length;i++) {
			inventory[i].setGetDate(d);
			inventory[i].setGetAmount(10);
			int getA = inventory[i].getGetAmount(); // 출고
			int putA = inventory[i].getPutAmount(); // 입고
			inventory[i].setInventoryAmount(putA-getA);
			System.out.println(inventory[i]);
		}
		
		System.out.println("출고수량 부족시 ---------------------------------------------------------------");
		
		Date dd = new GregorianCalendar(2016,4,28).getTime();
		for(int i = 0;i<inventory.length;i++) {
			inventory[i].setGetDate(dd);
			inventory[i].setGetAmount(100);
			int getA = inventory[i].getGetAmount(); // 출고
			int putA = inventory[i].getPutAmount(); // 입고
			inventory[i].setInventoryAmount(putA-getA);
			System.out.println(inventory[i]);
		}
		
		
    }

}
