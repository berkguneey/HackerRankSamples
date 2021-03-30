package organizingcontainersofballs;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println(organizingContainers(new int[][] { { 1, 4 }, { 2, 3 } }));
		System.out.println(organizingContainers(new int[][] { { 0, 2, 1 }, { 1, 1, 1 }, { 2, 0, 0 } }));
	}

	static String organizingContainers(int[][] container) {

		final int n = container.length;
		final List<Integer> containerList = new ArrayList<Integer>();
		final List<Integer> ballList = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			int ballCountInAContainer = 0;
			int totalCountOfBallType = 0;
			for (int j = 0; j < n; ++j) {
				ballCountInAContainer += container[i][j];
				totalCountOfBallType += container[j][i];
			}
			ballList.add(totalCountOfBallType);
			containerList.add(ballCountInAContainer);
		}
		containerList.removeAll(ballList);
		if (containerList.isEmpty()) {
			return "Possible";
		} else {
			return "Impossible";
		}

	}

}
