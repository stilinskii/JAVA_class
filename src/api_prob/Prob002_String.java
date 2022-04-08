package src.api_prob;

/*
 * javac Prob001_String.java
 * java Prob001_String JAva Test
 */
/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob001_String JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob002_String {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//source
		String data = String.join(" ",args);
		System.out.println("sourse : "+data);
		
		//convert
		char[] convert = data.toCharArray();
		
		for(int i = 0;i<convert.length;i++) {
			if(Character.isUpperCase(convert[i])){
				convert[i]=Character.toLowerCase(convert[i]);
			}else if(Character.isLowerCase(convert[i])) {
				convert[i]=Character.toUpperCase(convert[i]);
			}
		}
		String converted = String.valueOf(convert);
		System.out.println("convert: "+ converted);
		
		//length
		System.out.println("length: "+data.length());
		
		//reverse		
		StringBuffer sb = new StringBuffer(data);
		System.out.println("reverse : "+sb.reverse());
		
		
	}
		
}// end class

