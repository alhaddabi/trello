package trello;

import java.util.Arrays;

public class Quation12 {

	public static void main(String[] args) {
         //	   Problem: Given an array of integers, write a function that finds the maximum product that can be formed by multiplying any four integers.
	    //     Input: [1, 2, 3, 4, 5, 6]
	   //      Output: 120 (6 * 5 * 4 * 3)
	           int[] number = {1,2,3,4,5,6};
	          ;
	          
	           for (int i = 0 ; i < number.length ; i++)
	           {
	                 System.out.println(" "+number[i]);
	           }
	          int a = maxprodect(number);
	          
	          System.out.println(a);


	}
	         public static int maxprodect(int [] number) {
		     int total= 1;// we have to give the have 1 so when we multiply we will not get the value 0 
		     Arrays.sort(number);
	          for(int l = 2 ; l < number.length ; l ++)// starting the for loop from 2 to get the last 4 elements 
	          {
	              total = number[l]*total;
	          }
	     System.out.println("( "+number[5]+"*"+number[4]+"*"+number[3]+"*"+number[2]+" )");
	     System.out.println("the total value is "+number[2]*number[3]*number[5]*number[4]);// type number.length if you have alot of index 
	          return total;

	}

}
