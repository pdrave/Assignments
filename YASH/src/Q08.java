import java.util.Scanner;
import java.util.function.Predicate;

public class Q08
{
		
	   public static boolean check(int num)
	   {
		 Predicate<Integer>prd=p->(p%2==0);
		 return prd.test(num);
	   }
	   
	   public static void main(String[] args) 
	{ 
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter The Number:");
		   int num=sc.nextInt();  
	  
	   
	   if(Q08.check(num)==true)
	   {
		   System.out.println("Number is Even");
		   
	   }
	   
	   else
	   {
		   System.out.println("Number Is Odd");
	   }
	   
	   
	   
	  
		
		
	}

}
