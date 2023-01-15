package trello;

import java.util.HashSet;
import java.util.Scanner;

public class Quation8 {

	public static void main(String[] args) {

		//Sort an array of integers while removing the duplicate
		HashSet<Integer> integers = new HashSet<Integer>();
		Scanner sr = new Scanner(System.in);
		boolean condition=true;
		int count = 0 ;
		while(condition) {
			System.out.println("enter a number up to 99 ");
			System.out.println("Or type stop to exit :");
			int number = sr.nextInt();
			String stop = sr.next();
			if(stop.equals("stop")) {
				System.out.println("exit ");
				condition=false;
			}
			else {
				integers.add(number);
				count++;
			}
		}
		count=count-integers.size();
	    System.out.println(integers);
	    System.out.println("the number of removed duplicates are "+ count);
      
	    sr.close();
	}
   
}
