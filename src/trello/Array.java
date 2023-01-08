package trello;
public class Array {

	public static void main(String[] args) {

	    String[] word = new String[6];
	    word[0]="adnan";
	    word[1]="adnan";
	    word[2]="oman";
	    word[3]="majid";
	    word[4]="oman";
	    word[5]="oman";
		int count ; 
		for (int l = 0 ; l<word.length ; l++)
		{
			count =1;
			for (int k = l+1 ; k<word.length ; k++)
                 {
                     if(word[l].equals(word[k]))
                     {
                    	 count = count +1;
                    	 word[k]="0";
                     }
                 }
			if(word[l]!="0")
			{
				System.out.println(word[l]+" have been repated "+count+" time");
			}
		}
}

	}


