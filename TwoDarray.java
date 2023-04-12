package Array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		//compile-time initialization
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows:");
		int row=sc.nextInt();
		System.out.println("Enter the no.of columns:");
		int col=sc.nextInt();
		int a[][]=new int [row][col];
				
		System.out.println("Enter "+row+"x"+col+"elements:");
		
		for (int i=0; i < row; i++) 
					  for (int j = 0; j < col; j++) { 
			                a[i][j]= sc.nextInt();
			            }
					  
			        for (int i= 0; i < row; i++) {
			            for (int j = 0; j < col; j++) {
			                System.out.print(a[i][j] + " ");
			            }
			            System.out.println();
				sc.close();
		}
  }
}

