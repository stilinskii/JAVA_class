package src.java_test.test12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropTest {

    public static void main(String[] args) {
	File path = new File(".\\src\\ncs\\test12\\data.xml");
	try {
	    FileReader file = new FileReader(path);
	    Properties prop = new Properties();
	    
	    
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} 
    	
    }
        
        public void fileSave(Properties p) {
    	
        }
        
        public void fileOpen(Properties p) {
    	
        }

}
