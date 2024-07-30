package days22;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
		
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);
		File parent = new File(currentDirectory);
		System.out.println(parent.isDirectory());
		String[] slist = parent.list(); // 하위 디렉토리 + 파일 목록 반환
		// String[] flist = parent.list() 필터링된 하위 디 + 파일 목록
		// File[] fArr = parent.listFiles()  //파일 배열로 반환
		/*
		for (String str : slist) {
			System.out.print(str + "/");
			File child = new File(parent, str);
			System.out.println(child.isFile() ? "파일" : "폴더");
		}
		*/
		
		File[] list = parent.listFiles();
		for (File child : list) {
			String name = child.getName();
			long ms = child.lastModified();
			Date d = new Date(ms);
			String pattern = "yyyy-MM-dd a h:mm";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			System.out.printf("%s\t%s\t%s\t%d\n", 
					child.isFile()?"파일":"[폴더]", 
							name,
							sdf.format(d),
							child.length());
		}
	}

}
