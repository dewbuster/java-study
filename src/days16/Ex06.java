package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days16\\SS21.txt";
		// System.out.println(System.getProperty("user.dir"));
		String[] nameArr = getFileContent(fileName);
		
		String content = "<ol><li>" + String.join("</li><li>", nameArr) + "</li></ol>";
		System.out.println(content);
		
		
	} // main
	
	private static String[] getFileContent(String fileName) {
		
		String[] nameArr = new String[10];
		
		try (FileReader reader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(reader);      
				) {
			String line = null;
			int index = 0;
			while(  ( line = bufferedReader.readLine() ) != null) {
				nameArr[index++] = line;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		return nameArr;
	}

} // class
