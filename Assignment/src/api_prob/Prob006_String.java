package src.api_prob;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * [실행결과]
 * 97에서 122까지정수 입력:122
 * z
 */
public class Prob006_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("97에서 122까지정수 입력:");
			try {
				int x = sc.nextInt();
				if (x < 97 || x > 122) {
					System.out.println("97에서 122까지정수만 입력해주세요.");
					continue;
				}
				System.out.printf("%s\n", result(toChar(x)));
				break;

			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요");
				sc.nextLine();
				continue;
			}

		}

		sc.close();

	}

	public static char toChar(int x) {
		
		return (char) x;
	}

	public static String result(char data) {
		return String.valueOf(data);
	}
}
