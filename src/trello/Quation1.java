package trello;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quation1 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		
		boolean t1 = false;
		boolean t2 = false;
		int number1 ;
		int number2 ;
		do
		{
			t1 = false ;
		try // for handing the exception 
		{
		    System.out.println("please Enter the first number :");
		    number1 = sr.nextInt();
	        if(number1 <= 100 )
		    {
		          t1 = true;
		    }
		    else 
		    {
				System.out.println("=================please Enter number from 1 to 100 only===================");
		    }
		}
		    catch (InputMismatchException w){ 
			System.out.println("================you can only type an Integer==================");
			t1 = true;
			sr.next(); 
		    }
		}while(t1);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		do
		{
			t2 = false ;
		try // for handing the exception 
		{
		    System.out.println("please Enter the first number :");
		    number2 = sr.nextInt();
		    if(number2 < 100 )
		    {
		          t2 = true;
		    }
		    else 
		    {
				System.out.println("=================please Enter number from 1 to 100 only===================");
		    }
		}
		    catch (InputMismatchException w) { 
			System.out.println("================please Enter only a Integer==================");
			t1 = true;
			sr.next(); 
		    }
		}while(t2);
		
		
		sr.close();
		}
	   
	}

