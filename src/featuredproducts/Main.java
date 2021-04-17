package featuredproducts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		System.out.println(featuredProduct(new ArrayList<String>(Arrays.asList("greenShirt", "bluePants", "redShirt",
				"blackShoes", "redPants", "redPants", "whiteShirt", "redShirt"))));
		System.out.println(featuredProduct(new ArrayList<String>(Arrays.asList("yellowShirt", "redHat", "blackShirt",
				"bluePants", "redHat", "pinkHat", "blackShirt", "yellowShirt", "greenPants", "greenPants"))));
	}

	public static String featuredProduct(List<String> products) {
		Map<String, Integer> map = new HashMap<>();

		for (String product : products) {
			if (map.get(product) != null) {
				map.put(product, map.get(product) + 1);
			} else {
				map.put(product, 1);
			}
		}

		int maxCountInMap = Collections.max(map.values());

		List<String> list = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxCountInMap) {
				list.add(entry.getKey());
			}
		}

		Collections.sort(list);

		return list.get(list.size() - 1);

	}
}
