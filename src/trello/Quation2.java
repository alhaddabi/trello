package trello;
public class Quation2 {

	public static void main(String[] args) {
		int[] number = {1,2,22,2};
		int largestNumber = number[0];
		int lowerNumbner = number[0];

		for (int i = 1; i < number.length; i++) {
		  if (number[i] > largestNumber) {
			  largestNumber = number[i];
		  }
		}

		System.out.println("The larger numnber is : " + largestNumber);
	
	for (int l = 0 ; l<number.length ; l++)
	{
		if (number[l] < lowerNumbner)
		{
			lowerNumbner = number[l];
		}
	}
	System.out.println("The lower numnber is : " + lowerNumbner);

	
	}
}
