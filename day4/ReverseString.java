package week1.day4;

public class ReverseString {

	public static void main(String[] args) {

		String S= "Testleaf";
		int length = S.length();
		
		for (int i = length-1;i>=0;i--)
		{
			System.out.println(S.charAt(i));
			
		}
	}

}
