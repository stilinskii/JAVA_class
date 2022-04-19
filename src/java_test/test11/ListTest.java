package src.java_test.test11;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ListTest {
    public static void display(List<Integer> list) {
    	list.forEach(e -> System.out.print(e + " "));
    	System.out.println();
    }
    
    
    
    public static void main(String[] args) {
	List<Integer> ran = new Random().ints(10,1,100).boxed().collect(Collectors.toList());
	
	System.out.print("정렬전 : ");
	display(ran);
	System.out.print("정렬후 : ");
	ran.sort(new Descending());
	display(ran);
	
	
    }
}