package src.java_test.test05;

public class BookArrayTest {

    public static void main(String[] args) {
	Book bArray [] = new Book[3];
	bArray[0] = new Book("자바의 정석","남궁성",30000,"도우출판",0.1);
	bArray[1] = new Book("열혈강의 자바","구정은",29000,"프리렉",0.1);
	bArray[2] = new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1);
	
	for(Book data:bArray) {
	 int price = data.getPrice();
	 double dis = data.getDiscountRate();
	    System.out.printf("%s, %s, %s, %d원, %.0f%% 할인\n",
		    data.getTitle(),data.getAuthor(),data.getPublisher(),price,dis*100);
	    System.out.printf("할인된 가격 : %.0f원\n", price - (price*dis));
	}
    }

}
