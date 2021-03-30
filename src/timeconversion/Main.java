package timeconversion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Date example: 07:05:45PM 12:40:22AM 12:05:39AM
		System.out.print("Enter a date: ");
		String date = scanner.nextLine();
		String result = timeConversion(date);
		System.out.print("After time conversion: " + result);
		scanner.close();
	}

	static String timeConversion(String date) {
		String[] array = date.split(":");
		String hour = array[0];
		String minute = array[1];
		String second = array[2].substring(0, 2);
		String period = array[2].substring(2, 4);

		String result;

		if ("PM".equals(period)) {
			if (!"12".equals(hour)) {
				hour = String.valueOf(Integer.parseInt(hour) + 12);
			}
		} else if ("AM".equals(period)) {
			if ("12".equals(hour)) {
				hour = "00";
			}
		}
		result = hour + ":" + minute + ":" + second;
		return result;
	}

}
