package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		int arr1[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the elements of array:");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Sorting elements of array:(Ascending)");
		Arrays.sort(arr1);
		for(int var:arr1) {
			System.out.println(var+" ");
		}
		System.out.println();
		Integer arr2[]= {100,34,56,77,93};
		System.out.println("Sorting elements of array:(Descending)");
		Arrays.sort(arr2,Collections.reverseOrder());
		for (int var: arr2) {
		System.out.println(var+" ");
		sc.close();
		}
	}  
}
