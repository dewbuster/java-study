package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex02_06 {

	public static void main(String[] args) {
		// 85.86KB
		String parent = ".\\src\\days22";
		String child = "시간표_(5강의실)(디지털컨버전스)AWS 클라우드와 Kafka를 활용한 Java(자바) Full-Stack 개발자 양성과정(E).xlsx";
		// 10KB 양성과정(E)_1.xlsx
		// 10KB 양성과정(E)_2.xlsx
		File file = new File(parent, child);
		System.out.println("> 파일 크기 : " + file.length() + "(bytes)");
		
		final int VOLUME = 10 * 1024;
		
		String baseName = getBaseFileName(child);
		String ext = getExtension(child);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		int code = 0;
		int index = 0; // 양성과정(E)_[index].xlsx
		int readBytes = 0; // 읽어온 바이트 수
		try ( FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis)){
			while ((code = bis.read()) != -1) {
				
				if (readBytes % VOLUME == 0) {
					if ( readBytes != 0 ) bos.close();  // 파일 저장
					
					// 양성과정(E)_[index].xlsx
					child = String.format("%s_%d%s", baseName, ++index, ext);
					
					File temp = new File(parent, child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				}
				bos.write(code);
				readBytes++;
			}
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // main
	
	// 확장자를 반환하는 메서드
	public static String getExtension(String fileName) {
		int pos = fileName.indexOf(".");
		return fileName.substring(pos);
	}
	
	// 확장자를 제외한 파일명 반환 메서드
	public static String getBaseFileName(String fileName) {
		int pos = fileName.indexOf(".");
		return fileName.substring(0, pos);
	}

} // class
