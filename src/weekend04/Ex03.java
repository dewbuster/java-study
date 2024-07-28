package weekend04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Ex03 {

	public static void main(String[] args) {
		
		String id = null;
		String pw = null;
		String db = null;
		Properties p = new Properties();
		
		String fileName = ".\\src\\weekend04\\config.properties";
		File file = new File(fileName);
		
		if (file.exists()) {
			try (FileReader reader = new FileReader(fileName)){
				p.load(reader);
				id = p.getProperty("id");
				pw = p.getProperty("pw");
				db = p.getProperty("db");

			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			id = "wch";
			pw = "123123a";
			db = "oracle.jdbc.driver.OracleDriver";
			p.setProperty("id", id);
			p.setProperty("pw", pw);
			p.setProperty("db", db);
			
			try ( FileWriter writer = new FileWriter(fileName) ){
				p.store(writer, "config comment");
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		System.out.printf("id:%s, pw:%s, db:%s\n", id, pw, db);
		
		
	}

}
