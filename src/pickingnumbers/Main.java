package pickingnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println(pickingNumbers(new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 2))));
		System.out.println(pickingNumbers(new ArrayList<>(Arrays.asList(4, 6, 5, 3, 3, 1))));
	}

	static int pickingNumbers(List<Integer> a) {

		Collections.sort(a);

		List<Integer> result = new ArrayList<>();

		int count = 0;
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (Math.abs(a.get(i) - a.get(j)) > 1) {
					break;
				}
				int diff = j - i;
				if (diff > 0) {
					count = diff;
				}
			}
			result.add((count != 0) ? count + 1 : 0);
		}

		return Collections.max(result);
	}

}
