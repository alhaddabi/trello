package trello;
import java.util.Arrays;
public class Quation6 {

	public static void main(String[] args) {
		int[] arrayNumbers= {1,2,3};
		int[] arrayNumberss= {5,6,7};
		int[]  totalSum = new int [arrayNumbers.length] ;
		
		for(int i = 0 ; i<arrayNumbers.length; i++) 

		{
			totalSum[i] = arrayNumbers[i] + arrayNumberss[i];
		}
			System.out.println("the total array are "+Arrays.toString(totalSum));		
}
}
