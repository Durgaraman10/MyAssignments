package week1.day4;

import java.util.Scanner;

public class palinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int input=121,output=0,remainder;
        int originalNum=input;
        while (input!=0) {
			remainder=input%10;
			output=output*10+remainder;
			input/=10;
			
		}
        if (originalNum==output) {
			System.out.println(originalNum+"is palindrome");
		} else {
             System.out.println(originalNum+"is not palindrome");
		}
        
        
	}

}
