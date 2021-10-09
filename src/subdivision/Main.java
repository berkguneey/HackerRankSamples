package subdivision;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println(birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));
		System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
	}

	public static int birthday(List<Integer> s, int d, int m) {
		int result = 0;
		for (int i = 0; i < s.size() - m + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + m; j++) {
				sum += s.get(j);
			}
			if (sum == d) {
				result++;
			}
		}
		return result;
	}
}
