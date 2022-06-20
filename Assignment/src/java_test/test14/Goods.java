package src.java_test.test14;

public class Goods {
	private String name;
	private int price;
	private int quantity;
	
	 public Goods() {
		// TODO Auto-generated constructor stub
	}

	public Goods(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	 
	@Override
	public String toString() {
		
		return String.format("%s, %d 원, %s 개\n총 구매 가격 : %d원",name,price,quantity,price*quantity);
	}
}
