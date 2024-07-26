package days19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		gameNumber = scanner.nextInt();
		
		ArrayList<Integer> lotto;
		ArrayList<ArrayList<Integer>> lottos = new ArrayList<>();
		
		for (int i = 1; i <= gameNumber; i++) {
			lotto = new ArrayList<Integer>();
			fillLotto(lotto);
			lottos.add(lotto);
		}
		
		Iterator<ArrayList<Integer>> ir = lottos.iterator();
		while (ir.hasNext()) {
			lotto = ir.next();
			lotto.sort(null);
			dispLotto(lotto);
		}
	}

	private static void dispLotto(ArrayList<Integer> lotto) {
		Iterator<Integer> ir = lotto.iterator();
		while (ir.hasNext()) {
			int n = ir.next();
			System.out.printf("[%d]",n);
		}
		System.out.println();
		
	}

	private static void fillLotto(ArrayList<Integer> lotto) {

		lotto.addAll(new Random().ints(1, 46).distinct().limit(6).sorted().boxed().collect(Collectors.toList()));
	}
}
