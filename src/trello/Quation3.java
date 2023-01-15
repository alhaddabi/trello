package trello;
public class Quation3 {

	public static void main(String[] args) {
		// get 2 pairs to find the sum total value 
		int[] arrayNumbers = {2,3,4,5,1,7,10};
		int totalSum = 7;
		
		for(int i = 0 ; i<arrayNumbers.length ; i++) {
			for (int l=0 ; l<arrayNumbers.length ; l++) {
				if(arrayNumbers[i] + arrayNumbers[l] == totalSum)
				{
					System.out.println("the pairs are====" +arrayNumbers[i]+"==== and ===="+ arrayNumbers[l]+"====");
				}	
		}
	}
}
}
