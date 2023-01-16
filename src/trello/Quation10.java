package trello;
import java.util.Stack;
public class Quation10 {

	public static void main(String[] args) {
		// Given an array of integers, find the two numbers that appear only once in the array.
		
		
		
		// not completed !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Stack<Integer> stc = new Stack<>();
		int[] array = {1,2,2,3,4,5,5};
		int count;
		for (int i = 0 ; i < 6 ; i++) 
		{
			
			for (int p = i+1 ; p < 6 ; p++)
			{
			count = 1;
		    if(array[i] != array[p])
			   {
				stc.push(array[i]);
				count++;
			   }
	        }
        }
		for(Integer s : stc)
		{
			System.out.print(" "+s);
		}
	}
}