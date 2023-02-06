/* Denny To
 * CSCI 1302
 * 80183
 * Assignment 1
 * Problem 1
 */

import java.util.Scanner;

public class Assignment1Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double [][] firstMatrix = new double[3][3]; //creating the first 3x3 2D-Array
		double [][] secondMatrix = new double[3][3];//creating the second 3x3 2D-Array
				
		//nested for-loop to user's input
		//of the elements of the first 2D-Array
		System.out.print("Enter elements of the first 3 x 3 matrix: ");
		for (int row = 0; row < firstMatrix.length; row++) {
			for (int col = 0; col < firstMatrix.length; col++) {
				firstMatrix[row][col] = sc.nextDouble();
			}
		}
		//nested for-loop to user's input
		//of the elements of the second 2D-Array
		System.out.print("Enter elements of the second 3 x 3 matrix: ");
		for (int row = 0; row < secondMatrix.length; row++) {
			for (int col = 0; col < secondMatrix.length; col++) {
				secondMatrix[row][col] = sc.nextDouble();
			}
		}
		
		//Printing out the first 2D-Array
		System.out.println("\nMatrix 1: ");
		for (int row = 0; row < firstMatrix.length; row++) {
			  for (int col = 0; col < firstMatrix[row].length; col++) {
				  System.out.print(firstMatrix[row][col] + "  ");
			  }
			  System.out.println();
		}
		//Printing out the second 2D-Array
		System.out.println("Matrix 2: ");
		for (int row = 0; row < secondMatrix.length; row++) {
			  for (int col = 0; col < secondMatrix[row].length; col++) {
				  System.out.print(secondMatrix[row][col] + "  ");
			  }
			  System.out.println();
		}
		
		//transposing Matrix 2
		System.out.println("\nMatrix 2 Transposed: ");
		for (int row = 0; row < secondMatrix.length; row++) {
			  for (int col = 0; col < secondMatrix[row].length; col++) {
				  System.out.print(secondMatrix[col][row] + "  "); //rows and cols are switched
			  }
			  System.out.println();
		}
		
		//adding the elements of the same index
		System.out.println("\nMatrix 1 + Matrix 2 Transposed: ");
		for (int row = 0; row < firstMatrix.length; row++) {
			  for (int col = 0; col < firstMatrix[row].length; col++) {
				  System.out.print(firstMatrix[row][col] + secondMatrix[col][row] + "  ");
			  }
			  System.out.println();
		}
		
	}
	
}
