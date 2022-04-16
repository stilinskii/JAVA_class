package src.java_test.test02;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double[] data = new double[5];
		double sum = 0;

		
		
		String[] st = str.split(",");

		for (String d : st) {
			for (double toNum : data) {
				toNum = Double.parseDouble(d);
			}
			sum += Double.parseDouble(d);
		}
		
		//cnt를 이용하는 방법도 있었다..!왜 생각을 못했지?
		int i =0;
		for(String d : st) {
			data[i] = Double.parseDouble(d);
			sum += data[i++];
		}
		
		

		

		System.out.printf("합계:%.3f\n평균:%.3f", sum, sum / data.length);

	}

}
