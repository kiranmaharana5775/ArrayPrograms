package array_questions;

import java.util.Iterator;
import java.util.Scanner;

public class Question5 {
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
		
		System.out.println("The Occurance of elements are");
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
                    count++;                       
                }
            }

           for(int k=i+1;k<arr.length;k++) {
        	   if(arr[i]==arr[k]) {
        		   arr[k]=-1;
        	   }
           }
           if(count>0) {
        	   System.out.println(arr[i]+" occurance is "+count);
           }
		}
		
	}
	
}
