package trello;
public class Quation16 {

	public static void main(String[] args) {
//Problem: Given an array of integers, write a function to find the missing number in the array 
//where the missing number should be a multiple of 5.
//Input: [5, 10, 20, 25, 30],
//Output: 15
		
		int[] number = {5,10,20,25,30};
		int total = 0;
		for(int i = 0 ; i < 4 ; i++)	
		{
			for(int l = i+1 ; l < 4 ; l++)
			    {
			         if( number[i]+5 != number[l])
			             {
				            total = number[i] + 5 ;
			             }
			
			     }
			
		}
	System.out.println("the missing number is "+total);
		
	}
}
