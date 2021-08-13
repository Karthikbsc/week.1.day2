package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String word1 ="Testleaf";
		char repeated ='e';
		int count =0;
		for (int i = 0; i < word1.length(); i++) {
	if(word1.charAt(i)==repeated)
		count++;
	
		}
			System.out.println("Character " +repeated+ " Repeated "+count+" times");	
		
	}
}
