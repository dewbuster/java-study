package days11;

public class Ex05 {

	public static void main(String[] args) {
		// 로또 게임 + 게임 횟수 입력
		int n = 5;
		int[][] lottos = new int[n][6];
		
		for (int i = 0; i < lottos.length; i++) {
			fillLotto(lottos[i]);
		}
		for (int i = 0; i < lottos.length; i++) {
			dispLotto(lottos[i]);
		}

	} // main
	
	private static void fillLotto(int[] lotto) {
		int lottoNumber;
		lotto[0] = (int) (Math.random() * 45) + 1;
		//System.out.println(lotto[0]);
		int index = 1;
		while (index < lotto.length) {

			lottoNumber = (int) (Math.random() * 45) + 1;
			//System.out.println(lottoNumber);
			if ( !isDuplicate(lotto, lottoNumber, index) ) lotto[index++] = lottoNumber;
		} 
	}

	private static boolean isDuplicate(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if (lotto[i] == lottoNumber) {
				return true;
			}
		}
		return false;
	}

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

}
