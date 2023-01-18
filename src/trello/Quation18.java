package trello;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class Quation18 {

	public static void main(String[] args) {
// Create a function in Java that checks whether a given string is a palindrome using a stack.
		
		Stack<String> stc = new Stack<String>();
		Scanner sr = new Scanner(System.in);
		
		String name = "oman";
		for(int i = 0 ; i < name.length() ; i++)
		{
		   char a = name.charAt(i);
			String aa = "" + a;
			stc.push(aa);
		}
	    
		String reverse="";
		for(int l = 0 ; l < name.length() ; l++)
		{
			reverse = reverse + stc.pop();
		}
		System.out.println(reverse);

		if(reverse.equals(name))
		{
			System.out.print("the name =="+name+"== its same like =="+reverse+"== in reverse");
		}
		else
		{
			System.out.print("they are not the same");
		}
		
		sr.close();
	}

}
