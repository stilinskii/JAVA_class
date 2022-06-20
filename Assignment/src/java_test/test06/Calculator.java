package src.java_test.test06;

import java.util.stream.IntStream;

public class Calculator {

	public static double getSum(int data) throws InvalidException {
		if (data < 2 || data > 5) {

			throw new InvalidException("입력값에 오류가 있습니다");

		} 
//		else {
//			for (int i = 1; i <= data; i++) {
//				sum += i;
//			}
//		}
		
		return IntStream.rangeClosed(1, data).sum();
	}
}
