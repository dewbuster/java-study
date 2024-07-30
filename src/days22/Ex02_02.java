package days22;

import java.io.File;

/**
 * @author dewbuster
 * @date 2024. 7. 30.-오전 9:44:53
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		String pathname = ".\\src\\days21";
		// days21 폴더 안에서 자바파일(.java)만 조회
		File file = new File(pathname);
		File[] list = file.listFiles();
		
		for (File child : list) {
			/*if (child.isFile() && child.getName().endsWith(".java"))
				System.out.println(child.getName());
			 */
			if (child.isFile()){
				int idx =  child.getName().indexOf('.');
				String fileName = child.getName().substring(idx);
				if (fileName.equals(".java")) {
					System.out.println(child.getName());
				}
			}
		}
	}

}
