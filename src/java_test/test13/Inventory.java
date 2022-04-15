package src.java_test.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
    private String productName;
    private Date putDate;
    private Date getDate;
    private int putAmount;
    private int getAmount;
    private int inventoryAmount;
    
   public Inventory() {
}

public Inventory(String productName, Date putDate, int putAmount) {
    this.productName = productName;
    this.putDate = putDate;
    this.putAmount = putAmount;
    this.inventoryAmount = this.putAmount;
    
}
   
	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 입고");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 출고");
		if(getDate!=null) {
			return String.format("%s, \t %s, %d개, %s, %d개, 재고 %d개", 
				    productName, format.format(putDate),putAmount,format2.format(getDate),getAmount,inventoryAmount);
		}
		
	    return String.format("%s, \t %s, %d개, %s, %d개, 재고 %d개", 
		    productName, format.format(putDate),putAmount,getDate,getAmount,inventoryAmount);
	    
	}
	
	
	//getters setters 
	public void setGetDate(Date setDate) {
	    this.getDate = setDate;
	}
	

	
	public void setGetAmount(int getAmount){
		
		try {
		if(getAmount>putAmount) {
			
			throw new AmountNotEnough("현재 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
		}
		}catch(AmountNotEnough e) {
			System.out.println(e.toString());
			System.exit(0);
		}
	    this.getAmount = getAmount;
	}
	
	
	

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

	public int getPutAmount() {
	    return putAmount;
	}

	public void setPutAmount(int putAmount) {
	    this.putAmount = putAmount;
	}

	public int getGetAmount() {
	    return getAmount;
	}


	public int getInventoryAmount() {
	    return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
	    this.inventoryAmount = inventoryAmount;
	}
	
	
   
   
}
