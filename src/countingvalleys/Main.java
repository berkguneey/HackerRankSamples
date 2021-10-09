package countingvalleys;

public class Main {

	public static void main(String[] args) {
		System.out.println(countingValleys(8, "UDDDUDUU"));
		System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
	}

	public static int countingValleys(int steps, String path) {
		int level = 0, valleys = 0;
		boolean belowSea = false;
		char[] chArr = path.toCharArray();
		for (char ch : chArr) {
			if ('U' == ch) {
				level++;
			} else {
				level--;
			}

			if (!belowSea && level < 0) {
				belowSea = true;
				valleys++;
			}

			if (level >= 0) {
				belowSea = false;
			}
		}
		return valleys;
	}
}
