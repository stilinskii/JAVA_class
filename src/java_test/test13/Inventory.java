package src.java_test.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName;
	private Date putDate; // 입고일
	private Date getDate; // 출고일
	private int putAmount; // 입고수량
	private int getAmount; // 출고수량
	private int inventoryAmount;// 재고수량

	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public Inventory(String productName, Date putDate, int putAmount) {
		super();
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
		this.inventoryAmount = putAmount;
	}

	@Override
	public String toString() {
		SimpleDateFormat putFormat = new SimpleDateFormat("yyyy년 M월 dd일 입고");
		SimpleDateFormat getFormat = new SimpleDateFormat("yyyy년 M월 dd일 출고");
		String rdate = getDate == null ? null : getFormat.format(getDate);

		return String.format("%s, %d개, %s, %d개, 재고 %d개", putFormat.format(putDate), putAmount, rdate, getAmount,
				inventoryAmount);
	}

	// getters setters

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {

		try {
			if (getAmount > this.getInventoryAmount()) {
				throw new AmountNotEnough("재고부족");
			}else {
				this.getAmount = getAmount;
				this.inventoryAmount -= getAmount;
				
			}

		} catch (AmountNotEnough e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

}
