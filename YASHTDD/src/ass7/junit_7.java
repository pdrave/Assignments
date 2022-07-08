package ass7;

public class junit_7 
{

	public static boolean checkPalindrome(int number)
    {
	  int rem, sum=0, temp;
	  
	  temp=number;
	  
	  while(number>0)
	  {
		  rem=number%10;
		  sum= (sum*10)+rem;
		  number=number/10;
		  
	  }
	  
	  if(temp==sum)
	  {
		  System.out.println("Palindrome Number"+temp);
		  return true;
		  
	  }
	  
	  else 
	  {
		  System.out.println("Not A Palindrome Number"+temp);
		  return false;
		  
	  }
	  
	  
    }
}
