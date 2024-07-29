package days21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;

/**
 * @author dewbuster
 * @date 2024. 7. 29.-오후 2:29:38
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days21\\student.txt";

		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);   ){
			// "홍길동,98,89,20,207,69.000000,true"
			String info = br.readLine();

			//System.out.println( info );
			// MassageFormat
			String pattern ="{0},{1},{2},{3},{4},{5},{6}";
			MessageFormat mf = new MessageFormat(pattern );
			Object [] datas = mf.parse(info);
			
			String name = (String) datas[0];
			int kor = Integer.parseInt((String)datas[1]);
			int eng = Integer.parseInt((String)datas[2]);
			int mat = Integer.parseInt((String)datas[3]);
			int tot = Integer.parseInt((String)datas[4]);
			double avg =  Double.parseDouble((String)datas[5]);
			boolean gender = Boolean.parseBoolean((String) datas[6]);

			System.out.printf("%s %d %d %d %d %f %b\n"
					, name , kor, eng, mat, tot, avg, gender);

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class
