package savetheprisoner;

public class Main {

	public static void main(String[] args) {
		System.out.println(saveThePrisoner(4, 6, 2));
		System.out.println(saveThePrisoner(5, 2, 1));
	}

	static int saveThePrisoner(int n, int m, int s) {

		int jokedPrisoner = (s + m - 1) % n;
		if (jokedPrisoner == 0) {
			jokedPrisoner = n;
		}
		return jokedPrisoner;

	}

}
