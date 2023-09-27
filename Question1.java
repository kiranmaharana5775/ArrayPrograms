package array_questions;

import java.util.Scanner;

public class Question1 {
	static Scanner scanner=new Scanner(System.in);
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
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='0' && arr[i]<='9') {
//			if(Character.isDigit(arr[i])) {
				count++;
			}
		}
		System.out.println("The number of digits are: "+count);
		
	}
}
