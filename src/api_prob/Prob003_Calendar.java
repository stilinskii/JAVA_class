package src.api_prob;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


/*
 * [출력결과]
 * <4시부터 12시 미만일때>
 * 지금은 5시 35분입니다.
 * Good Morning
 * 
 * <12시부터 18시 미만일때>
 * 지금은 16시 49분입니다.
 * Good Afternoon
 * 
 * <18시부터 22시 미만일때>
 * 지금은 20시 30분입니다.
 * Good Evening
 * 
 *  <그외 일때>
 *  Good Night
 */


public class Prob003_Calendar {
	public static void main(String[] args) {

		
		int time = LocalTime.now().getHour();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("지금은 H시 m분입니다.");
		String now = LocalTime.now().format(formatter);
		
		
		if(time >= 4 && time <12) {
			System.out.println(now);
			System.out.println("Good Morning");
		}else if(time >= 12 && time <18) {
			System.out.println(now);
			System.out.println("Good Afternoon");
		}else if(time >= 18 && time <22) {
			System.out.println(now);
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
			
		}
		
		//////////////////////////////////////////////
		
		Calendar today = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("지금은 H시 m분입니다.");
		String now2 = format.format(today.getTime());		
		
		int hour = today.get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 4 && hour <12) {
			System.out.println(now2);
			System.out.println("Good Morning");
		}else if(hour >= 12 && hour <18) {
			System.out.println(now2);
			System.out.println("Good Afternoon");
		}else if(hour >= 18 && hour <22) {
			System.out.println(now2);
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
			
		}
		
		
			
	}//end main()
}//end class
