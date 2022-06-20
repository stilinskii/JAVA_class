package src.java_test.test13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Inventory> map = new HashMap<String, Inventory>();
		map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7",new GregorianCalendar(2016,3-1,15).getTime(),30));
		map.put("LG G5", new Inventory("LG G5",new GregorianCalendar(2016,2-1,15).getTime(),20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro",new GregorianCalendar(2016,1-1,23).getTime(),15));
		
		//기본정보 출력
		for(Map.Entry<String, Inventory> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		//출고 10 적용
		int getNum = 10;
		map.values().forEach(e -> {
			e.setGetDate(new Date());
			e.setGetAmount(getNum);
		});
				
		//Inventory배열에 넣기 map to array
		Collection<Inventory> val = map.values();
		Inventory[] data = val.toArray(new Inventory[0]);
		
		//Inventory배열 출력
		System.out.println("출고수량 10적용");
		Arrays.stream(data).forEach(System.out::println);
	}

}
