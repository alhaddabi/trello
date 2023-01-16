package trello;

import java.util.Arrays;

public class Quation11 {

	public static void main(String[] args) {
		 // Problem: Given an array of integers, write a function that finds the third highest number in the array.
	    // Input: [1, 5, 9, 3, 7, 8, 2, 4, 6]
	    // Output: 7
	       	int[] number = {1,5,9,3,7,8,2,4,6};
			int thirdHighestNumber = number[0];
			Arrays.sort(number);// this code is to re-order the array in the right order 
			for (int i = 1; i < number.length; i++) {
			  if (number[i] > thirdHighestNumber) {
				  thirdHighestNumber = number[i] - 2  ;
			  }
			}
			System.out.println("The third larger numnber is : " + thirdHighestNumber);
	}

}
