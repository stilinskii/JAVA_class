package src.java_test.test15;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {
	static File file = new File(".\\src\\java_test\\test15\\books.dat");

	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book>();

		test5.storeList(list);// Book 객체를 3개 생성하여 리스트에 넣는다.

		test5.saveFile(list); // books.dat 파일에 리스트에 저장된 Book 객체들을 저장한다.
		List<Book> booksList = test5.loadFile();
		// books.dat 파일로부터 객체들을 읽어서 리스트에 담는다.
		test5.printList(booksList); // 리스트에 저장된 객체 정보를 출력한다.
		// 할인된 가격은 booksList 에 기록된 객체 정보를 사용하여 getter 로 계산 출력한다.

	}

	public void storeList(List<Book> list) {
		Book b1 = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15);
		Book b2 = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2);
		Book b3 = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);

		list.add(b1);
		list.add(b2);
		list.add(b3);

	}

	public void saveFile(List<Book> list) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			for (Book b : list) {
				oos.writeObject(b);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public List<Book> loadFile() {

		ArrayList<Book> list = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			list = new ArrayList<Book>();
			Object b = null;
			while ((b = ois.readObject()) != null) {
			//	System.out.println("?");
				list.add((Book) b);

			}

		
			ois.close();
		} catch (EOFException e) {

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

	public void printList(List<Book> list) {
		list.forEach(e -> System.out.println(e));
	}

}
