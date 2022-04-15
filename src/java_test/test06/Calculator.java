package src.java_test.test06;

public class Calculator{
    public double getSum(int data) {
	
	double sum = 0.0;
	try{
	    if(data<2 || data>5) {
		throw new InvalidException("입력값에 오류가있습니다.");
	}
	    
	for(int i = 1;i<=data;i++) {
	    sum += i;}
	
	}catch(InvalidException e) {
	    System.out.println(e.toString());
	    System.exit(0);
	}
	
	
	
	return sum;
    }
}
