package appendanddelete;

public class Main {

	public static void main(String[] args) {
		System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
		System.out.println(appendAndDelete("aba", "aba", 7));
		System.out.println(appendAndDelete("ashley", "ash", 2));
	}

	static String appendAndDelete(String s, String t, int k) {
		String result = null;
		if (k >= s.length() + t.length()) {
			return "Yes";
		}
		for (int i = s.length(); i >= 0; i--) {
			if (t.startsWith(s.substring(0, i))) {
				int diff = (s.length() - i) + (t.length() - i);
				result = diff <= k && (k - diff) % 2 == 0 ? "Yes" : "No";
				break;
			}
		}
		return result;
	}
}
