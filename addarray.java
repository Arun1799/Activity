//WAP to add the elements of two different arrays?
package Array;

import java.util.Scanner;

public class addarray {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Get the length of the arrays from the user
	        System.out.print("Enter the length of the arrays: ");
	        int length = sc.nextInt();

	        // Create the arrays
	        int[] arr1 = new int[length];
	        int[] arr2 = new int[length];
	        int[] result = new int[length];

	        // Get the values for the first array
	        System.out.println("Enter the values for the first array:");
	        for (int i = 0; i < length; i++) {
	            System.out.print("Enter value " + (i+1) + ": ");
	            arr1[i] = sc.nextInt();
	        }

	        // Get the values for the second array
	        System.out.println("Enter the values for the second array:");
	        for (int i = 0; i < length; i++) {
	            System.out.print("Enter value " + (i+1) + ": ");
	            arr2[i] = sc.nextInt();
	        }

	        // Add the arrays
	        for (int i = 0; i < length; i++) {
	            result[i] = arr1[i] + arr2[i];
	        }

	        // Print the result
	        System.out.print("Resultant Array: ");
	        for (int i = 0; i < length; i++) {
	            System.out.print(result[i] + " ");
	            sc.close();
	        }
	    }
	}

