package src.java_test.test12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class PropTest {
	File file = new File("./src/java_test/test12/data.xml");
	public static void main(String[] args) {
		PropTest pt = new PropTest();
		Properties prop = new Properties();
		prop.setProperty("1","apple,1200,3");
		prop.setProperty("2","banana,2500,2");
		prop.setProperty("3","grape,4500,5");
		prop.setProperty("4","orange,800,10");
		prop.setProperty("5","melon,5000,2");
		
		pt.fileSave(prop);
		pt.fileOpen(prop);
		
	}

	public void fileSave(Properties p) {
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			
			//properties 값들 xml파일에 저장
			p.storeToXML(fos, null);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen(Properties p) {
		try {
			FileInputStream fis = new FileInputStream(file);
			p.loadFromXML(fis);
			
			Fruit[] fruit = new Fruit[p.size()];
			
			for(int i = 1;i<=fruit.length;i++) {
				String index = String.valueOf(i);
				
				String[] splited = p.getProperty(index).split(",");
				fruit[i-1] = new Fruit(splited[0],Integer.parseInt(splited[1]),Integer.parseInt(splited[2]));
			}
				
			Arrays.stream(fruit).forEach(System.out::println);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
