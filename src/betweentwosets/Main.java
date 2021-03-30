package betweentwosets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println(getTotalX(new ArrayList<>(Arrays.asList(2, 6)), new ArrayList<>(Arrays.asList(24, 36))));
		System.out.println(getTotalX(new ArrayList<>(Arrays.asList(2, 4)), new ArrayList<>(Arrays.asList(16, 32, 96))));
	}

	static int getTotalX(List<Integer> a, List<Integer> b) {

		boolean dividedExactly1;
		boolean dividedExactly2;
		int total = 0;

		for (int i = a.get(a.size() - 1); i <= b.get(0); i++) { // 6'dan 24'e
			dividedExactly1 = true;
			for (Integer value : a) {
				if (i % value != 0) {
					dividedExactly1 = false;
					break;
				}
			}

			if (dividedExactly1) {
				dividedExactly2 = true;
				for (Integer value : b) {
					if (value % i != 0) {
						dividedExactly2 = false;
						break;
					}
				}

				if (dividedExactly2) {
					total++;
				}
			}
		}

		return total;
	}

}
