package days17;

import java.io.FileReader;

public class Test03 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days17\\Ex01.java";
		int[][] counts = new int[3][];
		counts[0] = new int[26];
		counts[1] = new int[26];
		counts[2] = new int[10];
		
		try (FileReader fileReader = new FileReader(fileName)){
			int code;
			while ( (code = fileReader.read()) != -1 ) {
				if (Character.isUpperCase((char)code)) counts[0][code-'A']++;
				else if (Character.isLowerCase((char)code)) counts[1][code-'a']++;
				else if (Character.isDigit(code)) counts[2][code-'0']++;
			}
			for (int i = 0; i < counts.length; i++) {
				System.out.println("-".repeat(30));
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("%c : %s (%d)\n"
							, i==0? 'A'+j : i==1? 'a'+j : '0'+j
							,"#".repeat(counts[i][j]), counts[i][j]);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
