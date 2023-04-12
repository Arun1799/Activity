package Array;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {45,77,98,32,21};
		int temp=0;
		System.out.println("Original array:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		System.out.println("choose option:1)Ascending  2)Descending");
		int choice =sc.nextInt();
		switch(choice) 
		{
		case 1:
			for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println("Sorted array: (Ascending)");
			for(int var: a) 
			{
				System.out.println(var+" ");
			}
		    System.out.println();
		    break;
		case 2:
			for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println("Sorted array: (Descending)");
			for(int var: a) 
			{
				System.out.println(var+" ");
			}
		    System.out.println();
		    break;
				
		default:
				System.out.println("Wrong choice!!");
				sc.close();
			}
	     }
	}

