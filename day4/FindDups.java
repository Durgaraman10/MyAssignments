package week1.day4;

import java.util.Arrays;


public class FindDups {

	public static void main(String[] args) {
		int[] num1= {0,0,6,7,6,3,8,3};
		Arrays.sort(num1);
		
		for (int i=1; i<num1.length;i++) {
			if (num1[i-1]==num1[i]) {
				System.out.println(num1[i]);
			}
			
		}
		// TODO Auto-generated method stub

	}

}
