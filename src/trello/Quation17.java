package trello;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Quation17 {

	public static void main(String[] args) {
// Implement a stack data structure in Java using an array, with push and pop operations.

		Stack<String> stc = new Stack<String>();
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter your name ");
		String name = sr.next();
		stc.push(name);
		System.out.println("Enter your age ");
		int age = sr.nextInt();
		String agee = Integer.toString(age);
		stc.push(agee);
		System.out.println("Enter your Phone number ");
		int PhoneNumber = sr.nextInt();
		String PhoneNumberr = Integer.toString(PhoneNumber);
		stc.push(PhoneNumberr);
		System.out.println("your information is ");
		for (int i = 0; i < 3; i++) {
			System.out.print("" + stc.pop() + " ");
		}
		sr.close();
	}

}
