package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	

	public static void main(String[] args) {

		int[] arrNum = {1,3,2,4,6,5,7,9,8};
		Arrays.sort(arrNum);
		System.out.println("Print second largest :"+arrNum[arrNum.length-2]);

	}

}
