package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("C:\\QA\\Testing\\prop.properties");
		Properties prop = new Properties();
		 prop.load(fi);
		 
		 String s =prop.getProperty("browser");
		 System.out.println(s);
		 
		 String email = prop.getProperty("incorrectemail");
		 System.out.println(email);

		 System.out.println(prop.getProperty("correctEmail"));
		 System.out.println(prop.getProperty("defect"));
		 System.out.println(prop.getProperty("url"));
		 
		 prop.setProperty("testing","automation");
		 System.out.println(prop.getProperty("testing"));
		 
		 prop.setProperty("tool","selenium");
		 System.out.println(prop.getProperty("tool"));
		 
		 FileOutputStream fo = new FileOutputStream("C:\\QA\\Testing\\prop.properties");
		 prop.store(fo,"Adding to Properties File");
		
	

	}

}
