package days21;

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		// days21.Ex01.java
		// 텍스트파일 -> 문자 스트림
		// 파일		+ 문자 스트림 = FileReader, FileWriter
		// [ File 클래스 ]
		// 파일+디렉토리를 다루는 여러 기능이 구현된 클래스
		// 				(생성, 삭제, 정보, 파일명 변경 등)
		
		//String parent = ".\\src\\days21";
		File parent = new File(".\\src\\days21");
		String child = "Ex01.java";
		
		File file = new File(parent, child);
		System.out.println(file.length() + "(bytes)");
		System.out.println(file.isDirectory() + " / " + file.isFile());
		
		long ms = file.lastModified(); // 1900.1.1.~
		System.out.println(ms);
		
		Date d = new Date(ms);
		String pattern = "yyyy년 MM월 dd일 hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(d));
		
		try (FileReader reader = new FileReader(file)) {
			int code;
			while ((code = reader.read()) != -1) {
				System.out.printf("%c", (char)code);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // main

} // class
