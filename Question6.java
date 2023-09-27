package array_questions;

import java.util.Scanner;

public class Question6 {
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
		System.out.print("The distinct elements are: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					System.out.print(arr[i]+" ");
				}
				if(arr[i]==arr[j]) {
					break;
				}
			}
		}
	}
}
