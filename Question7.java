package array_questions;
import java.util.Scanner;

public class Question7 {
		static Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) {
			System.out.println("Enter the number of elements we want to enter:");
			int size = scanner.nextInt();

			int[] arr = new int[size];
			System.out.println("Enter the elements:");
			System.out.println();

			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the " + (i + 1) + " element");
				arr[i] = scanner.nextInt();
			}
			System.out.print("The distinct odd elements are: ");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(i==j) {
						if((arr[i]%2)!=0) {
						System.out.print(arr[i]+" ");
						}
					}
					if(arr[i]==arr[j]) {
						break;
					}
				}
			}
		
	}

}
