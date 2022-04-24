package src.java_test.test13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Inventory> map = new HashMap<String, Inventory>();
		map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7",new GregorianCalendar(2016, 2, 15).getTime(),30));
		map.put("LG G5", new Inventory("LG G5",new GregorianCalendar(2016, 1, 25).getTime(),20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro",new GregorianCalendar(2016,0,23).getTime(),15));
		
		//기본정보 출력
		for(Map.Entry<String, Inventory> entry : map.entrySet()) {
			System.out.printf("%s\n",entry.getValue());
		}
		
		//출고수량 10 적용
		int getNum = 10;
		map.keySet().forEach(e -> {
			map.get(e).setGetDate(new Date()); 
			map.get(e).setGetAmount(getNum);
		});
		
		// 적용 후 배열로 전환
		Collection<Inventory> val = map.values();
		Inventory[] as = val.toArray(new Inventory[0]);// 파라미터의 배열의 크기가 list의크기보다 작다면 list크기로 자동조정
		
		//배열출력
		System.out.println("출고수량 10적용");		
		Arrays.stream(as).forEach(System.out::println); // 배열출력

		
		
		
	}

}
