package array_questions;

import java.util.Scanner;

public class Question3 {
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
		System.out.println("The prime elements are: ");
		for (int i = 0; i < arr.length; i++) {
			if (prime(arr[i])) {
				System.out.println(arr[i] + " ");
			}
		}

	}

	private static boolean prime(int n) {
		if (n <= 1) {
	        return false;
	    }
	    
	    for (int i = 2; i <= (n/2); i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    
	    return true;
	}
	
}
