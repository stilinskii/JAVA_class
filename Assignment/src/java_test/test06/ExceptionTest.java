package src.java_test.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("결과값 :" + Calculator.getSum(sc.nextInt()));
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
		
		
	}
	
	
	

}
