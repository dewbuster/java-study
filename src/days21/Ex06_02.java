package days21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author dewbuster
 * @date 2024. 7. 29.-오전 11:16:29
 * @subject Everything.exe -> Everything_copy.exe
 * @content FileInputStream	FileOutputStream
 * 			BufferedInputStream BufferedOutputStream
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceFile = "C:\\Users\\User\\Downloads\\Everything-1.4.1.1024.x64-Setup.exe";
		String copyFile = "C:\\Users\\User\\Documents\\Everything-1.4.1.1024.x64-Setup_copy.exe";

		//> 복사 처리 시간 : 3747724100(ns)
		//> 복사 처리 시간 : 6020600(ns)
		fileCopyBinaryStream(sourceFile, copyFile);
	}

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile);
				BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
				){
			byte[] b = new byte[BUFFER_SIZE];
			int readByteNumber;
			while ((readByteNumber = bis.read(b)) != -1) {
				
				bos.write(b, 0, readByteNumber);
			}
			bos.flush();
			System.out.println("파일 복사 완료!!!");
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
