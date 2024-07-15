package days11;

public class Ex06 {

public static void main(String[] args) {
		
		int[][] m = new int[5][5];
		
		fillM(m);
		fillM2(m);
		fillM3(m);
		fillM4(m);
		fillM5(m);
		fillM6(m);
		dispM(m);
		
	} // main
	// 대각선
	//	[01][02][04][07][11]
	//	[03][05][08][12][16]
	//	[06][09][13][17][20]
	//	[10][14][18][21][23]
	//	[15][19][22][24][25]
	private static void fillM6(int[][] m) {
		

	}
	
	// [골뱅이]
	/*
	  [01][02][03][04][05]
	  [16][17][18][19][06]
	  [15][24][15][20][07]
	  [14][23][22][21][08]
	  [13][12][11][10][09]
	*/
	private static void fillM5(int[][] m) {

	}
	
	/* 지그재그
	[01][02][03][04][05]
	[10][09][08][07][06]
	[11][12][13][14][15]
	[20][19][18][17][16]
	[21][22][23][24][25]
	*/
	private static void fillM4(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				//         열갯수
				if (i % 2 == 0)	m[i][j] = i * m[i].length + j + 1;
				else m[i][j] = i * m[i].length + m[i].length - j;
				
			} // for j
			System.out.println();
		} // for i
	}

	/*
	[05][10][15][20][25]
	[04][09][14][19][24]
	[03][08][13][18][23]
	[02][07][12][17][22]
	[01][06][11][16][21]
	*/
	private static void fillM3(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				//         열갯수
				m[i][j] = (j + 1) * m[i].length - i;
			} // for j
			System.out.println();
		} // for i
		//0 0 5 0 1 10 0 2 15
		//1 0 4 1 1 9  1 2 14
	}

	private static void fillM2(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				//         열갯수
				m[i][j] = 25 - m[i].length * i - j;
			} // for j
			System.out.println();
		} // for i
	}

	private static void fillM(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				//         열갯수
				m[i][j] = m[i].length * i + j + 1;
			} // for j
			System.out.println();
		} // for i
	}

	private static void dispM(int[][] m) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(); 

		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				System.out.printf("[%02d]", m[i][j]);
			} // for j
			System.out.println();
		} // for i
	}

}
