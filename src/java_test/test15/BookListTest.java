package src.java_test.test15;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest{
	static File file = new File(".\\src\\java_test\\test15\\books.dat");

	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book>();
		
		test5.storeList(list);
		test5.saveFile(list);
		
		List<Book> booksList = loadFile();
		test5.printList(booksList);

	}
	
	public void storeList(List<Book> list) {
		list.add(new Book("자바의 정석","남궁성",30000,"도우출판",0.15));
		list.add(new Book("열혈강의 자바","구정은",29000,"프리렉",0.2));
		list.add(new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1));		
		
	}
	
	public void saveFile(List<Book> list) {
		
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			
			for(int i =0;i<list.size();i++) {
				oos.writeObject(list.get(i));
			}
			
			oos.close();
			//System.out.println("저장완료");
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
}
	
	public static List<Book> loadFile(){
		
		ArrayList<Book> booklist= null;
		try {
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			
			booklist = new ArrayList<Book>();
			Object bk = null;
			while((bk = ois.readObject())!=null) {
				booklist.add((Book)bk);
			}
			
			ois.close();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return booklist;
		
		
	}
	
	public void printList(List<Book> list) {
		
		for(Book data: list) {
			System.out.println(data);
			System.out.println("할인된 가격 :" + ((data.getPrice() - (int)(data.getPrice()*data.getDiscountRate())) + "원"));
		}
		
//		for(int i =0;i<list.size();i++) {
//			System.out.println(list.get(i));
//			
//		}
		
		
	}

}
