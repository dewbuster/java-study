package days20;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author dewbuster
 * @date 2024. 7. 26.-오전 10:45:57
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		/*
		 * Map : HT, HM, TM, SM, Properites 컬렉션 클래스
		 * 1. Hashtable<String, String> == Properites
		 * 2. key + value = entry
		 * 3. 환경 설정값들을 파일로 저장/읽기
		 * 							 put()/get() X
		 * 					setProperty()/getProperty()
		 * 4. 저장되는 파일확장자  .properties
		 *		store(), storeToXML()
		 *		load()
		 */
		// 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 ) 
		String className = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Properties p = new Properties();
		p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		p.setProperty("user", "scott");
		p.setProperty("password", "tiger");
		
		String fileName = ".\\src\\days20\\jdbcConfig.xml";
		
		try (FileOutputStream outputStream = new FileOutputStream(fileName)){
			p.storeToXML(outputStream, "jdbc config sample");
			System.out.println(" SAVE END ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
