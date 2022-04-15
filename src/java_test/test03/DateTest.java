package src.java_test.test03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

    public static void main(String[] args) {
	Calendar now = new GregorianCalendar(2016,3,18);
	Calendar bd = new GregorianCalendar(1987,4,27);
	SimpleDateFormat forNow = new SimpleDateFormat("yyyy년 M월 dd일");
	SimpleDateFormat forBd = new SimpleDateFormat("yyyy년 M월 dd일 E요일");
	
	int year = bd.get(GregorianCalendar.YEAR);
	int nyear = now.get(GregorianCalendar.YEAR);
	int age = nyear - year;	
	
	
	///결과
	System.out.println("생일 : "+forBd.format(bd.getTime()));
	System.out.println("현재 : "+forNow.format(now.getTime()));
	System.out.println("나이 : "+age+" 세");
	
    }

}
