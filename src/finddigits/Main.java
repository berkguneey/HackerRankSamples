package finddigits;

public class Main {

	public static void main(String[] args) {
		System.out.println(findDigits(124));
		System.out.println(findDigits(1012));
	}

	public static int findDigits(int n) {
		int divisorCount = 0;
		int orgNumber = n;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			if (digit != 0 && orgNumber % digit == 0) {
				divisorCount++;
			}
		}
		return divisorCount;
	}

}
