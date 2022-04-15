package src.java_test.test06;

import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	Calculator cal = new Calculator();
	System.out.println("결과값 :"+cal.getSum(num));
	
	sc.close();
    }

}
