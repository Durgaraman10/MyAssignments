package week1.day3;

public class IsPrime {
         static boolean isPrime(int n)
         {
        	 if(n<=1)
        		 return false;
        	 
        	 for(int i=2;i<n/2;i++)
        		 if(n%i==0)
        			return false; 
        	 
        	 return true;
         }
	public static void main(String[] args) 
	{
        int num=13;
        if (isPrime(num)) {
			System.out.println(num+"is prime");
		} 
        else {
             System.out.println(num+"is not prime");
		}
	}

}
