package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author dewbuster
 * @date 2024. 7. 30.-오전 9:01:20
 * @subject 자바 IO
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		// [File 클래스]
		//String path = ".\\src\\days21\\Ex01.java";
		String path = "C:\\Class\\Workspace\\JavaClass\\java-study\\src\\days21\\Ex01.java";
		File file = new File(path);
		
		System.out.println(file.getParent());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		// 절대경로
		System.out.println(file.getAbsolutePath());
		// 표준경로
		System.out.println(file.getCanonicalPath());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length()); // byte
		System.out.println(file.exists());
		// OS에서 사용하는 경로 구분자
		System.out.println(file.pathSeparator);
		// OS에서 사용하는 이름 구분자
		System.out.println(file.separator);
		
		String fileName = file.getName();
		
	}

}
