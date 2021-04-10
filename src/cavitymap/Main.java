package cavitymap;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(cavityMap(new String[] { "989", "191", "111" })));
		System.out.println(Arrays.toString(cavityMap(new String[] { "1112", "1912", "1892", "1234" })));
	}

	static String[] cavityMap(String[] grid) {

		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();

		for (int i = 1; i < grid.length - 1; i++) {
			for (int j = 1; j < grid[i].length() - 1; j++) {
				int value = Character.getNumericValue(grid[i].charAt(j));
				int left = Character.getNumericValue(grid[i - 1].charAt(j));
				int right = Character.getNumericValue(grid[i + 1].charAt(j));
				int top = Character.getNumericValue(grid[i].charAt(j - 1));
				int bottom = Character.getNumericValue(grid[i].charAt(j + 1));
				if (value > left && value > right && value > top && value > bottom) {
					x.add(i);
					y.add(j);
				}
			}
		}
		
		for (int i = 0; i < x.size(); i++) {
			grid[x.get(i)] = grid[x.get(i)].substring(0, y.get(i)) + "X"
					+ grid[x.get(i)].substring(y.get(i) + 1, grid[x.get(i)].length());
		}
		
		return grid;
	}

}
