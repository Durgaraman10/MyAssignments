package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// To check length of string is equal
    
		String text1= "stops";
        String text2= "potss";
    //to check length of the string is equal
    if (text1.length() != text2.length()) 
    {
		System.out.println("not anagram");
	}
	//convert given string to character array
        char[]charArray1 = text1.toCharArray();
    	char[]charArray2 = text2.toCharArray();	
    	
    	//sorting in ascending order
    	Arrays.sort(charArray1);
    	Arrays.sort(charArray2);
    	
    	//check if anagram using Arrays.equal() method
    	if (Arrays.equals(charArray1,charArray2)) {
			System.out.println("Given string is anagram");
		} else {
            System.out.println("Given string is not anagram");
		}
	}
	

}
