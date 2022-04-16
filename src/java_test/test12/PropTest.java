package src.java_test.test12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropTest {
	static File path = new File(".\\src\\java_test\\test12\\data.xml");

    public static void main(String[] args) {
	Properties prop = new Properties();
	
	
	fileSave(prop);
	fileOpen(prop);
    	
    }
        
        public static void fileSave(Properties p) {
        	try {
				FileOutputStream fos = new FileOutputStream(path);
			
				p.setProperty("1", "apple,1200,3");
				p.setProperty("2", "banana,2500,2");
				p.setProperty("3", "grape,4500,5");
				p.setProperty("4", "orange,800,10");
				p.setProperty("5", "melon,5000,2");
				
				p.storeToXML(fos,null);
				
				fos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
			}
        	
        
    	
        }
        
        public static void fileOpen(Properties p) {
        	Fruit[] farr = new Fruit[p.size()];
        	
        	try {        		
				FileInputStream fis = new FileInputStream(path);
				//파일을 불러옴
				p.loadFromXML(fis);
				
				//반복문으로 인덱스별로 데이터불러와서 Fruit생성, 배열에 저장
				for(int i =1;i<=p.size();i++) {
					String index = String.valueOf(i);
					
					
					String[] data = p.getProperty(index).split(",");
					Fruit f = new Fruit(data[0],Integer.parseInt(data[1]),Integer.parseInt(data[2]));
					farr[i-1]=f;
					
				}
				
				
				for(Fruit ff:farr) {
					System.out.println(ff);
				}
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
    	
        }

}
