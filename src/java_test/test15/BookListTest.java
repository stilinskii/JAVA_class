package src.java_test.test15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class BookListTest implements Serializable{

	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book>();
		
		test5.storeList(list);
		test5.saveFile(list);
		List<Book> booksList = test5.loadFile();
		test5.printList(booksList);

	}
	
	public void storeList(List<Book> list) {
		list.add(new Book("자바의 정석","남궁성",30000,"도우출판",0.15));
		list.add(new Book("열혈강의 자바","구정은",29000,"프리렉",0.2));
		list.add(new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1));		
		
	}
	
	public void saveFile(List<Book> list) {
		File file = new File(".\\src\\java_test\\test15\\book.dat");
	
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file); // 파일생성
			OutputStreamWriter os = new OutputStreamWriter(fos);
			//OutputStreamWriter osw = new OutputStreamWriter(fos);    
		     //Writer writer = new BufferedWriter(osw);
			//FileWriter writer = new FileWriter(file);
			
			for(Book data: list) {
				//.writeObject(data.toString()+"\n");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<Book> loadFile(){
		return null;
		
	}
	
	public void printList(List<Book> list) {
		
	}

}
