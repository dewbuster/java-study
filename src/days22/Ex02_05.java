package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author dewbuster
 * @date 2024. 7. 30.-오전 10:49:41
 * @subject 
 * @content https://needjarvis.tistory.com/742
 */
public class Ex02_05 {

	public static void main(String[] args) throws IOException {
		/*
		 * days22
		 * 	ㄴ temp
		 * 		ㄴ a.txt 파
		 * 		ㄴ b.txt 파
		 * 		ㄴ subtemp
		 * 			ㄴ c.txt 파
		 */
		/*
		String pathname = ".\\src\\days22\\temp\\subtemp";
		File f = new File(pathname);
		f.mkdirs();
		//
		File atxt = new File(".\\src\\days22\\temp\\a.txt");
		atxt.createNewFile();
		File btxt = new File(".\\src\\days22\\temp\\b.txt");
		btxt.createNewFile();
		File ctxt = new File(".\\src\\days22\\temp\\subtemp\\c.txt");
		ctxt.createNewFile();
		*/
		String pathname = ".\\src\\days22\\temp";
		File f = new File(pathname);
		if (f.exists()) {
			// delete() 하위 디렉토리+파일이 없어야 삭제 할 수 있다.
			// System.out.println(f.delete());
			// 재귀함수
			scanDelete(f);
			f.delete();
			System.out.println(f.getName()+" 폴더 삭제");
		}
		System.out.println("end");
	}

	public static void scanDelete(File f) {
		File[] files = f.listFiles();

		for (File file : files) {
			if (file.isFile()) {
				file.delete();
				System.out.println(file.getName()+" 파일 삭제");
			} else {
				scanDelete(file.getAbsoluteFile());
				file.delete();
				System.out.println(file.getName()+" 폴더 삭제");
			}
		}
	}
}
