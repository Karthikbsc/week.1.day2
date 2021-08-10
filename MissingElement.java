package week1.day2;

public class MissingElement {

	public static void main(String[] args) {

		int[] arrNum  = {0,1,3,4,7,8};
		int i=0;
		for(i=0;i<arrNum.length;i++) {
			if(arrNum[i]!=i) {
				System.out.println("Missing Element "+i);
				
				
			}
		}

	}

}
