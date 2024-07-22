package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_02 {

	public static void main(String[] args) {
		// try~catch 연습
		// C:\Windows\comsetup.log  파일을 읽어와서 출력
		// 텍스트파일 읽기/쓰기 -> FileReader/FileWriter
		// 1:
		// 2:
		// 라인번호를 붙여서 출력.
		FileReader reader = null;
		// readLine() 한 라인을 읽어와 반환
		BufferedReader bufferedReader = null;
		String fileName = "C:\\Windows\\comsetup.log";
		int one = -1;
		try {
			reader = new FileReader(fileName);
			// 보조스트림 (2차 스트림)
			bufferedReader = new BufferedReader(reader);
			
			String line = null;
			int lineNumber = 1;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.printf("%d : %s\n", lineNumber++, line);
			}
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
					bufferedReader.close();
					reader = null;
					bufferedReader = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
