package array_questions;

import java.util.Scanner;

public class Question9 {
	static Scanner scanner = new Scanner(System.in);
	static int smallest;

	public static void main(String[] args) {

		System.out.println("Enter the number of elements we want to enter:");
		int size = scanner.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " element");
			arr[i] = scanner.nextInt();
			smallest = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < smallest) {
				smallest = arr[i];
			} else {
				continue;
			}
		}
		System.out.println("The nth smallest element is " + smallest);
	}

}
