package array_questions;

import java.util.Scanner;

public class Question4 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of elements we want to enter:");
		System.out.println();
		int size = scanner.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements:");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " element");
			arr[i] = scanner.nextInt();
		}
		System.out.println("The fibonacii elements are:");
		for(int i=0;i<arr.length;i++) {
			if(isFibonacci(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}

	private static boolean isFibonacci(int num) {
		return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
	}

	private static boolean isPerfectSquare(int x) {
		int sqrt = (int) Math.sqrt(x);
		return sqrt * sqrt == x;
	}
	
}
