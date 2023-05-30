package main;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[] { 2,5,99,34,56,21,41,76,98 };
		// Sorting the array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number from array to find its index::");
		int value = scanner.nextInt();
		// Searching the index using binary search
		int min = 0;
		int max = array.length-1;
		int mid = 0;
		while (min<=max) {
			mid=(min+max)/2;
			if (value==array[mid]) {
				System.out.println("Index of "+value+" is = "+mid);
				break;
			}
			if (value<array[mid]) 
				max=mid-1;
			else
				min=mid+1;
		}
		if (min>max) {
			System.out.println("Entered number "+value+" is not present in array");
		}
		scanner.close();
	}
}
