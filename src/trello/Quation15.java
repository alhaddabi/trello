package trello;

public class Quation15 {

	public static void main(String[] args) {
//Problem: Given an array of integers, write a function to find the longest decreasing subarray.
//Input: [1, 2, 3, 4, 5, 4, 3, 2, 1]
//Output: [5, 4, 3, 2, 1]
		
		// not completed 
		int[] number = {1,2,3,4,5,4,3,2,1};
		
		for(int i = 0 ; i < 8 ; i++)
		{
	
		if (number[i] >= number[i+1])
		       {
			        System.out.print(" "+number[i]);
		       }
		  }
	}

}
