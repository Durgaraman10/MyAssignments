package week1.day4;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr1[]= {1,4,3,2,8,6,7};
         Arrays.sort(arr1);
         for (int i = 0; i < arr1.length; i++) {
			if (arr1[i]!=i+1) 
			{
				System.out.println(i+1);
			     break;
			}
		}
	}

}
