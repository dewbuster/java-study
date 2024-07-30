package days22;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author dewbuster
 * @date 2024. 7. 30.-오전 9:44:53
 * @subject
 * @content
 */
public class Ex02_02_02 {

	public static void main(String[] args) {
		
		String pathname = ".\\src\\days21";
		// days21 폴더 안에서 자바파일(.java)만 조회
		File file = new File(pathname);
		/*
		File[] list = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		*/
		File[] list = file.listFiles( (dir,name) -> name.endsWith(".java"));
		for (File f : list) {
			System.out.println(f.getName());
		}
		
		
	}

}
