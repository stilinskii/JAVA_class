package src.java_test.test15;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {
	static File file = new File(".\\src\\java_test\\test15\\books.dat");

	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book>();

		test5.storeList(list);

		test5.saveFile(list);
		List<Book> booksList = test5.loadFile();

		test5.printList(booksList);
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

		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			list.forEach(t -> {
				try {
					oos.writeObject(t);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			
		}
	}

	public List<Book> loadFile() {

		ArrayList<Book> list = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

			list = new ArrayList<Book>();
			while (true) {
				try {
					list.add((Book) ois.readObject());
				} catch (EOFException e) {
					break;
				}

			}

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
		list.forEach(System.out::println);
	}

}
