package days22;

import java.io.File;

public class Ex02_04 {

	public static void main(String[] args) {
		String parent = ".\\src\\days22";
		// days22 폴더 안에 upload 폴더 유무 확인후 없으면 폴더 생성
		File uploadDir = new File(parent, "upload");
		//System.out.println(uploadDir.exists());
		if (!uploadDir.exists()) {
			System.out.println(uploadDir.mkdirs());
			//days22\\upload\\temp temp 폴더 만들때 부모upload폴더가 없어도 같이 만듦
			//uploadDir.mkdirs();
		} else {
			// upload 폴더 삭제
			System.out.println(uploadDir.delete());
			// deleteOnExit() 프로그램이 종료될 때 삭제
			//uploadDir.deleteOnExit();
		}
		
	} // main

} // class
