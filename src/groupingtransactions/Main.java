package groupingtransactions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		System.out.println(groupTransactions(
				new ArrayList<String>(Arrays.asList("notebook", "notebook", "mouse", "keyboard", "mouse"))));
	}

	public static List<String> groupTransactions(List<String> transactions) {
		Map<String, Integer> map = new HashMap<>();

		for (String transaction : transactions) {
			if (map.get(transaction) != null) {
				map.put(transaction, map.get(transaction) + 1);
			} else {
				map.put(transaction, 1);
			}
		}

		List<String> response = new ArrayList<>();

		map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
						.thenComparing(Map.Entry.comparingByKey()))
				.forEachOrdered(x -> response.add(x.getKey() + " " + x.getValue()));

		return response;

	}
}
