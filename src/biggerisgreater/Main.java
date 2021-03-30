package biggerisgreater;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		System.out.println(biggerIsGreater("dkhc"));
		System.out.println(biggerIsGreater("hefg"));
		System.out.println(biggerIsGreater("ab"));
		System.out.println(biggerIsGreater("bb"));

	}

	static String biggerIsGreater(String w) {

		char charArray[] = w.toCharArray();
		int n = charArray.length;
		int endIndex = 0;

		for (endIndex = n - 1; endIndex > 0; endIndex--) {
			if (charArray[endIndex] > charArray[endIndex - 1]) {
				break;
			}
		}

		if (endIndex == 0) {
			return "no answer";
		} else {
			int firstSmallChar = charArray[endIndex - 1];
			int nextSmallChar = endIndex;

			for (int startIndex = endIndex + 1; startIndex < n; startIndex++) {
				if (charArray[startIndex] > firstSmallChar && charArray[startIndex] < charArray[nextSmallChar]) {
					nextSmallChar = startIndex;
				}
			}

			swap(charArray, endIndex - 1, nextSmallChar);

			Arrays.sort(charArray, endIndex, n);

		}

		return new String(charArray);

	}

	static void swap(char charArray[], int i, int j) {
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
	}

}
