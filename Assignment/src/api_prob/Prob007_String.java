package src.api_prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob007_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));

		
	}// end main()

	public static char[] process(String data) {
		char[] arr = data.toCharArray();
		char[] cnt = new char[3];
		int cntLower = 0;
		int cntUpper = 0;
		int cntDigit = 0;
		for(int i =0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i])) {
				cntUpper++;
			}else if(Character.isLowerCase(arr[i])) {
				cntLower++;
			}else if(Character.isDigit(arr[i])) {
				cntDigit++;
			}
			
		}
		
		//숫자가 1~9일때만 가능
		char cntLower_char = (char)(cntLower +'0');
		char cntUpper_char = Integer.toString(cntUpper).charAt(0);
		//
		char cntDigit_char = Character.forDigit(cntDigit , 10);
		cnt[0] = cntLower_char;
		cnt[1] = cntUpper_char;
		cnt[2] = cntDigit_char;
		
		
		return cnt;
	}// end process()

	public static void display(char[] arr) {
		
		String d = String.valueOf(arr[0]);
		
		System.out.println("영어 소문자 갯수:"+ d);
		System.out.println("영어 대문자 갯수:"+ String.valueOf(arr[1]));
		System.out.println("숫자 갯수:"+ String.valueOf(arr[2]));
		
		
		
	}// end display()

}// end class
