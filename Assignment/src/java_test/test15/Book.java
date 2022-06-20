package src.java_test.test15;

import java.io.Serializable;

public class Book implements Serializable{
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s, %s, %s, %d원,%d%% 할인\n할인된 가격 : %d원",title,author,publisher,price,(int)(discountRate*100),(int)(price*(1-discountRate)));
	}
}
