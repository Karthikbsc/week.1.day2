package week1.day2;

public class PrintDuplicate {

	public static void main(String[] args) {

		int[] arrNum  = {0,1,2,2,3,4,4,7,8};
		for(int i=0;i<arrNum.length;i++) {
		for(int j=i+1;j<arrNum.length;j++)
		if(arrNum[i]==arrNum[j]) {
				System.out.println("Duplicate "+arrNum[j]);
				if(arrNum[i]!=i) {
					System.out.println("Missing Element "+i);
				}
			
			}			
			}
}
}
