package days19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		gameNumber = scanner.nextInt();
		
		HashSet lotto;
		ArrayList lottos = new ArrayList();
		
		for (int i = 1; i <= gameNumber; i++) {
			lotto = new HashSet();
			fillLotto(lotto);
			lottos.add(lotto);
		}
	    
		Iterator ir = lottos.iterator();
		while (ir.hasNext()) {
			lotto = (HashSet) ir.next();
			dispLotto(lotto);
		}

		
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
