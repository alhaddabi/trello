package trello;

public class Quation7 {

	public static void main(String[] args) {
		// This program is for compering and getting the larest profitable day 
		int[] rice = {900,1200,1210,900,750,1050};
		int[] wheat = {110,1900,1500,1500,1500,1500,1400};
		int largestNumber = rice[0];
		int largestNumberr = wheat[0];

		for (int i = 0 ; i < 5 ; i++)
		{
		 int comper = rice[i] - rice[i + 1];
		      rice[i]=comper;
		}
		
			for (int j = 0 ; j < 5 ; j++)
		{
		 int comper = wheat[j] - rice[j + 1];
		      wheat[j]=comper;
		}
		
		
		for (int i = 0 ; i < 5 ; i++)
	{
	    	System.out.println(rice[i]);
	    	if (rice[i] <largestNumber) 
	    	{
			  largestNumber = rice[i];
		    }
		}
			  System.out.println("the largest profit is "+ largestNumber);
		for (int j = 0 ; j < 5 ; j++)
	{
	    	System.out.println(wheat[j]);
	    	if (wheat[j] <largestNumberr) 
	    	{
			  largestNumber = wheat[j];
		    }
		}
			  System.out.println("the largest profit is "+ largestNumberr);
	}
}
