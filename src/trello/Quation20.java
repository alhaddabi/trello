package trello;

import java.util.Scanner;
import java.util.Stack;

public class Quation20 {

	public static void main(String[] args) {
		
		
		Stack<Integer> stc = new Stack<Integer>();
		Scanner sr = new Scanner(System.in);
		
		boolean p =true ;
		System.out.println("please Enter number from 1 ot 99 ");
		while(p){
		int number = sr.nextInt();
		if(number >= 100)
		{
			p = false;
		}
		else 
		{
			stc.push(number);
		}
		    stc.sort(null);
	       

		      }
			System.out.println("the enterd number are : "+stc);
			System.out.println("the second largest number is : "+stc.indexOf(stc.size()));

       sr.close();
	}

}
