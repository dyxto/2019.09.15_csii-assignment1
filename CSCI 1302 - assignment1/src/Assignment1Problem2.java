/* Denny To
 * CSCI 1302
 * 80183
 * Assignment 1
 * Problem 2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1Problem2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Integer> numList = new ArrayList <> ();
		
		System.out.print("Enter numbers to add to the list or -1 to quit: ");
		
		//variable for user input into the ArrayList
		int numElem = 0;
		
		while (numElem != -1) { //numElem starts as 0, so the while-loop is activated
			numElem = sc.nextInt(); //the next user input updates numElem
			numList.add(numElem); //because numElem is the user input
			//the int is added to the numList ArrayList
			if (numElem == -1) { //when user enters -1, the loop stops
				numList.remove(numList.size()-1); //and the -1 is removed from the ArrayList
			}
		}
		
		int validValue = 0;
		for (int i = 0; i < numList.size(); i++) {
			if(numList.get(i)%2==0 && i%2==1) { //element remainder must equal 0
				//AND index remainder must equal 1 to be TRUE
				validValue += numList.get(i); //if TRUE element value at index is
				//added to validValue variable
			}
			if(numList.get(i)%2==1 && i%2==0) { //element remainder must equal 1
				//AND index remainder must equal 0 to be TRUE
				validValue += numList.get(i); //if TRUE element value at index is
				//added to validValue variable
			}
			
		}
		
		System.out.print(numList + " -> " + validValue); //the ArrayList is printed
	}
}