package thetimeinwords;

public class Main {

	public static void main(String[] args) {
		System.out.println(timeInWords(5, 40));
		System.out.println(timeInWords(3, 0));
		System.out.println(timeInWords(4, 1));
	}

	private static String timeInWords(int h, int m) {
		String word[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
				"twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
				"twenty eight", "twenty nine" };

		String response = "";

		if (m == 0) {
			response = word[h] + " o'clock";
		} else if (m == 15) {
			response = "quarter past " + word[h];
		} else if (m == 45) {
			response = "quarter to " + word[h + 1];
		} else if (m == 30) {
			response = "half past " + word[h];
		} else if (m < 30) {
			response = word[m] + (m == 1 ? " minute past " : " minutes past ") + word[h];
		} else if (m > 30) {
			response = word[(60 - m)] + " minutes to " + word[h + 1];
		}

		return response;
	}

}
