package sherlockandsquares;

public class Main {

	public static void main(String[] args) {
		System.out.println(squares(24, 49));
		System.out.println(squares(100, 1000));
		System.out.println(squares(17, 24));
	}

	static int squares(int a, int b) {
		int start = (int) Math.sqrt(a);
		int end = (int) Math.sqrt(b);

		int count = end - start;
		count += Math.pow(start, 2) >= a ? 1 : 0; // check the first num.
		return count;
	}

}
