package src.java_test.test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		Goods goods = null;
		try {
			System.out.println("다음 항목의 값을 입력하시오.");
			System.out.print("상품명 : ");
			String name = br.readLine(); //string
			System.out.print("가격 : ");
			int price = Integer.parseInt(br.readLine()); //Int
			System.out.print("수량 : ");
			int quantity = Integer.parseInt(br.readLine()); //Int
			goods = new Goods(name,price,quantity);
			
			System.out.println("입력된 결과는 다음과 같습니다.");
			System.out.println(goods.toString());
			System.out.printf("총 구매 가격 : %d 원",goods.getPrice()*goods.getQuantity());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //String
		Goods g = new Goods();
		
		
		
	}

}
