package array_questions;

import java.util.Scanner;

public class Question2 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of elements we want to enter:");
		System.out.println();
		int size= scanner.nextInt();
		
		char[] arr= new char[size];
		System.out.println("Enter the elements:");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" element");
			arr[i]=scanner.next().charAt(0);
		}
		int charCount=0;
		int digCount=0;
		int special=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>='0' && arr[i]<='9') {
				digCount++;
			}else if (((arr[i]>='A' || arr[i]>='a') && (arr[i]<='Z' || arr[i]<='z'))) {
				charCount++;
			}else {
				special++;
			}
		}
		System.out.println("The number of digits are: "+digCount);
		System.out.println("The number of alphabets are: "+charCount);
		System.out.println("The number of special character are: "+special);
		
	}

}
