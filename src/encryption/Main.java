package encryption;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Input example: haveaniceday
		System.out.print("Enter an input: ");
		String input = scanner.nextLine();
		String result = encryption(input);
		System.out.print("After time encryption: " + result);
		scanner.close();
	}
	
	static String encryption(String input) {
		int length = input.length(); // 12
		double sqrt = Math.sqrt(length);
		int column = (int) Math.ceil(sqrt); // upper 4
		int row = (int) Math.floor(sqrt); // lower 3

		if (row * column < length) {
			row++;
		}

		String result = "";
		
//		First Way
//		char[][] arr = new char[row][column];
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < column; j++) {
//				if (i * column + j < length) {
//					arr[i][j] = input.charAt(i * column + j);
//				}
//			}
//		}
//
//		for (int i = 0; i < column; i++) {
//			for (int j = 0; j < row; j++) {
//				if (arr[j][i] != '\0')
//					result += arr[j][i];
//			}
//			
//			result += " ";
//		}
		
//		Second Way
		for (int i = 0; i < column; i++) {
			for (int j = i; j < length; j += column) {
				result += input.charAt(j);
			}
			result += " ";
		}
		
		return result;
	}
}
