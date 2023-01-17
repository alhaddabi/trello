package trello;

import java.util.Arrays;
import java.util.Stack;

public class Quation14 {

	public static void main(String[] args) {
//Problem: Given an array of integers, write a function to find the number of times a given integer value appears in the array where the value is greater than 10.
//Input: [1, 2, 15, 20, 15, 30, 20, 15, 15], val = 15
//Output: 4
		
		
		// not completed 
		int[] numbers = {1,2,20,15,15,30,15,15};
		  Arrays.sort(numbers);
		Stack<Integer> stck = new Stack<Integer>();

		
		for(int i = 0 ; i<numbers.length ; i++) {
		      
				if ( (numbers[i] > 10 && numbers[i] == numbers[i])  ) 
				{
				 stck.push(numbers[i]);
				}	
		}
		
		System.out.println(stck);
		for (int l =0; l < stck.size() ; l++)
		{
			if (stck.pop() == stck.pop())
			{
				stck.push(stck.pop());
			}
			System.out.println("the value is :"+stck.pop());
			System.out.println("it have been repeted : "+stck.size()+" time ");
			break;
		}
		
	

		}
	}

