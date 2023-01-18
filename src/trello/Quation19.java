package trello;
import java.util.Scanner;
import java.util.Stack;

public class Quation19 {
 // counting how many the words have been repated in the array
	public static void main(String[] args) {

	String[] names = { "adnan", "adnan", "adnan", "hisham", "hisham", "adnan","oman"};
		Scanner sr = new Scanner(System.in);
		Stack<String> stc = new Stack<String>();
		System.out.println("Please enter your name");
		String name = sr.next();
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				count++;
			}
		}
		System.out.print("the name " + name + " have been repeted " + count);
	}
}
