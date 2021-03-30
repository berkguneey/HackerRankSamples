package sherlockandthevalidstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		System.out.println(isValid("aabbcd"));
		System.out.println(isValid("aabbccddeefghi"));
		System.out.println(isValid("abcdefghhgfedecba"));
	}

	private static String isValid(String s) {
		Map<Character, Integer> frequencies = new HashMap<>();

		for (char c : s.toCharArray()) {
			if (frequencies.containsKey(c)) {
				frequencies.put(c, frequencies.get(c) + 1);
			} else {
				frequencies.put(c, 1);
			}
		}

		Set<Integer> frequencySet = new HashSet<>();
		for (int frequency : frequencies.values()) {
			frequencySet.add(frequency);
		}

		List<Integer> frequencyList = new ArrayList<Integer>(frequencySet);

		if (frequencySet.size() > 2) {
			return "NO";
		} else if (frequencySet.size() == 1) {
			return "YES";
		} else {
			int f1 = frequencyList.get(0);
			int f2 = frequencyList.get(1);
			int f1Count = 0;
			int f2Count = 0;
			for (int frequency : frequencies.values()) {
				if (frequency == f1)
					f1Count++;
				if (frequency == f2)
					f2Count++;
			}

			if ((f1 == 1 && f1Count == 1) || (f2 == 1 && f2Count == 1)) {
				return "YES";
			} else if ((Math.abs(f1 - f2) == 1) && (f1Count == 1 || f2Count == 1)) {
				return "YES";
			} else {
				return "NO";
			}
		}
	}
}
