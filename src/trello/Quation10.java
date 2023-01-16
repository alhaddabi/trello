package trello;
import java.util.Stack;
public class Quation10 {

	public static void main(String[] args) {
		// Given an array of integers, find the two numbers that appear only once in the array.
		
		
		Stack<Integer> stc = new Stack<>();
		int[] array = {1,1,2,3,3,4,5,5,6,};
		
		for (int i = 0 ; i < array.length; i++) 
		{
	     int count=0;
			for (int p = 0 ; p < array.length ; p++)
			{
			
		    if(array[i] == array[p])
			   {
				count++;
			   }
	        }
			if (count == 1)
			{
				stc.push(array[i]);
			}
        }
			System.out.print(" "+stc);
	}
}