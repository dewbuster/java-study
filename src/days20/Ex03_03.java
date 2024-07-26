package days20;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author dewbuster
 * @date 2024. 7. 26.-오전 11:31:12
 * @subject
 * @content jdbcConfig.propertires 파일에서 환경설정값을 얻어오기
 * 			p.load(FileReader)
 * 			value = p.getProperty(key)
 * 			p.keySet() 모든키를 얻어와서 value 출력
 */
public class Ex03_03 {

	public static void main(String[] args) {

		String className;
		String url;
		String user;
		String password;
		
		Properties p = new Properties();
//		p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
//		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
//		p.setProperty("user", "scott");
//		p.setProperty("password", "tiger");
		
		String fileName = ".\\src\\days20\\jdbcConfig.properties";
		
		try (FileReader reader = new FileReader(fileName)){
			p.load(reader);
			// user = p.getProperty("user");

			// 키 출력.
			Set<Object> ks = p.keySet();
			Iterator<Object> ir =  ks.iterator();
			while (ir.hasNext()) {
				String key = (String) ir.next();
				String value = p.getProperty(key);
				System.out.printf("key=%s, value=%s\n", key, value);
			}

			
			//System.out.println(" SAVE END ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
