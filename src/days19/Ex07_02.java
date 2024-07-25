package days19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex07_02 {

	public static void main(String[] args) {
		HashSet lotto = new HashSet();
		fillLotto(lotto);
		dispLotto(lotto);
	}

	private static void dispLotto(HashSet lotto) {
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%d]",n);
		}
		System.out.println();
		
	}

	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		int n;
		while ( lotto.size() < 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		}
	}

}
