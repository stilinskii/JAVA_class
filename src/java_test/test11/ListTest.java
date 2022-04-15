package src.java_test.test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest {
    public static void display(List list) {
	for(int i = 0;i<list.size();i++) {
	    System.out.print(list.get(i) + " ");
	}
	System.out.println();
    }
    
    public static void main(String[] args) {
	Random r = new Random();
	ArrayList<Integer> random = new ArrayList<>();
	for(int i = 0;i<10;i++) {
	    random.add(r.nextInt(99)+1);
	}
	display(random);
	random.sort(new Decending());
	//Collections.sort(random);
	display(random);
	
	

	
	
    }
}
