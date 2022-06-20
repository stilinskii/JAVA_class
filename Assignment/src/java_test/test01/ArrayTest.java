package src.java_test.test01;

public class ArrayTest {

    public static void main(String[] args) {
	int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
	
	double sum = 0;
	int cnt = 0;
	for(int i = 0;i<array.length;i++) {
	    for(int j =0;j<array[i].length;j++) {
		sum += array[i][j];
		cnt++;
	    }
	}
	
	//이렇게 하는 방법도 있다. 이게 제일 효율적인 거 같다.
	for(int[] i: array) {
		for(int j : i) {
			System.out.println(j);
		}
	}
	
	//큰 배열의 수 * 작은 배열의 수 = 배열 요소의 개수, 그러나 이건 큰 배열들의 요소가 같은경우에만 가능
	//avg = (double)sum/(array.length*array[0].length);

	
	System.out.printf("합계 : %.2f\n평균 : %.2f\n",sum,sum/cnt);
    
    }

}
