package trello;

public class Quation13 {

	public static void main(String[] args) {
//Problem: Given an array of integers and a number k, write a function to determine if there are two distinct elements in the array that add up to k and both elements should be even number.
//Input: [1, 2, 4, 6, 8, 10], k = 10
//Output: true (2 + 8 = 10)
		
		int[] arrayNumbers = {1,2,4,6,8,10,9};
		
		int totalSum = 10;
		for(int i = 0 ; i<arrayNumbers.length ; i++) {
			
			for (int l=i+1 ; l<arrayNumbers.length ; l++) {
				if (arrayNumbers[i] % 2==0 && arrayNumbers[l] % 2==0 )// we used the % to avoid getting an odd number 
				{
				if(arrayNumbers[i] + arrayNumbers[l]  == totalSum  ) 
				{   
					               System.out.println(arrayNumbers[i]+" + "+ arrayNumbers[l]+" = "+ " 10 ");  
				}	
				}
		}
	
		}
	}

}
