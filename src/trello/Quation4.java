package trello;
import java.util.Scanner;
public class Quation4 {

	public static void main(String[] args) {
	    
		
		int[] numbers = {1,2,3,1};
		Scanner sr = new Scanner(System.in);
		System.out.println("please enter the number you want to count : ");
		int findTheNumebr = sr.nextInt();
		int count=0;
		for (int i = 0 ; i<numbers.length ; i++)
		{
			if (numbers[i] == findTheNumebr)
			{
				count++;
			}
		}
		System.out.println("the number=="+ findTheNumebr +"== have been find ==="+count+"=== time");
		sr.close();
		
		
	}
}
