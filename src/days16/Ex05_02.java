package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex05_02 {

	public static void main(String[] args) {

		// days16.Ex01.java 읽어와서
		// "예외" 문자열이 있는 위치값을 모두 출력...


//      String fileName = "C:\\Class\\Workspace\\JavaClass\\java-study\\src\\days16\\Ex01.java";
		String fileName = ".\\src\\days16\\Ex01.java";  // . -> 프로젝트폴더까지

		int one = -1;
		String content = getFileContent(fileName);
		content = content.replace("예외", "[예외]");
		
		// "홍길
		content = content.replaceAll("예외", "[예외]");
		//						All->[regex]
		System.out.println(content);
		
		/*
		int index, fromIndex = 0;
	    while (  (index = content.indexOf("예외", fromIndex) ) != -1  ) {
	    	System.out.println( index );
	    	fromIndex = index + 1;
	    }
	    */

	} // main

	private static String getFileContent(String fileName) {
		String content = "";
		try (FileReader reader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(reader);      
				) {
			String line = null;
			while(  ( line = bufferedReader.readLine() ) != null) {
				content += line + "\r\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		return content;
	}

} // class
