package trello;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quation1 {
      // getting the error message and re-typing the input again
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		boolean condition1=true;
		boolean condition2=true;
		do{
	        try {  
				System.out.println("please enter first number between 1 - 100");
	            int first = sr.nextInt(); 
	            if(first>0 && first<100) {
	                    	 condition1=false;
	                     }
	        }   
	        catch (InputMismatchException ex) {  
                System.out.println("================you can only type an Integer==================");
	            condition1=true;
	            sr.next();
	       }  
	    }
	    while(condition1);
		do{
	        try {  
				System.out.println("please enter second number between 1 - 100");
	            int second = sr.nextInt(); // we give big integer  value as input    
	            if(second>0 && second<100) {
	               condition2=false;
	           }
	        }   
	        catch (InputMismatchException ex) {  
                System.out.println("================you can only type an Integer==================");
	            condition2=true;
	            sr.next();
	                }  
	    }   
	    while(condition2);
		sr.close();
	}
}


