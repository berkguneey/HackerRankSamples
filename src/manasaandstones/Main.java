package manasaandstones;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(stones(3, 1, 2)));
		System.out.println(Arrays.toString(stones(4, 10, 100)));
		System.out.println(Arrays.toString(stones(7, 9, 11)));
	}

	static int[] stones(int n, int a, int b) {

		if (a == b) {
			int[] response = new int[1];
			response[0] = (n - 1) * b;
			return response;
		}
		int[] response = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = a * ((n - 1) - i) + b * i;
			response[i] = temp;
		}
		Arrays.sort(response);

		return response;

	}

}
