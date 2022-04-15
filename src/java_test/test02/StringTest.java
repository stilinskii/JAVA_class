package src.java_test.test02;

public class StringTest {

    public static void main(String[] args) {
	String str = "1.22,4.12,5.93,8.71,9.34";
	double[] data= new double[5];
	double sum = 0;
	
	String[] st = str.split(",");
	

	for(String d:st) {
	    for(double toNum:data) {
		toNum=Double.parseDouble(d);
	    	}
	    sum+=Double.parseDouble(d);
	}
	
	System.out.printf("합계:%.3f\n평균:%.3f",sum,sum/data.length);
	
	
	
	 
    }

}
