package Array;

import java.util.Scanner;

public class mergearray {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Get the size of the first array from the user
		        System.out.print("Enter the size of the first array: ");
		        int size1 = sc.nextInt();

		        // Create the first array and fill it with values from the user
		        int[] arr1 = new int[size1];
		        System.out.println("Enter the values of the first array:");
		        for (int i = 0; i < size1; i++) {
		            arr1[i] = sc.nextInt();
		        }

		        // Get the size of the second array from the user
		        System.out.print("Enter the size of the second array: ");
		        int size2 = sc.nextInt();

		        // Create the second array and fill it with values from the user
		        int[] arr2 = new int[size2];
		        System.out.println("Enter the values of the second array:");
		        for (int i = 0; i < size2; i++) {
		            arr2[i] = sc.nextInt();
		        }

		        // Merge the two arrays into a single array
		        int[] mergedArr = new int[size1 + size2];
		        int index = 0;
		        for (int i = 0; i < size1; i++) {
		            mergedArr[index] = arr1[i];
		            index++;
		        }
		        for (int i = 0; i < size2; i++) {
		            mergedArr[index] = arr2[i];
		            index++;
		        }

		        // Print the merged array
		        System.out.println("The merged array is:");
		        for (int i = 0; i < mergedArr.length; i++) {
		            System.out.print(mergedArr[i] + " ");
		            sc.close();
		        }
		    }
    }

