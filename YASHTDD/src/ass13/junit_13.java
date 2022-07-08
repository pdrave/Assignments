package ass13;

import java.util.Scanner;

public class junit_13
{
	public static void main(String[] args) 
	{
		char operator;
		Double num1,num2,result;
		
		Scanner sc = new Scanner(System.in);
		
			
	    System.out.println("Choose An Operator : +,-,*, /,%,^,");
	    operator=sc.next().charAt(0);
	    
	    
	    System.out.println("Enter first number");
	    num1 = sc.nextDouble();
	    
	    System.out.println("Enter Second Number");
	    num2 = sc.nextDouble();
	    
	    
	     switch(operator)
	      {
	    
	      case '+':
	          result = num1 + num2;
	          System.out.println(num1 + " + " + num2 + " = " + result);
	          break;
         
	      case '-':
	          result = num1 + num2;
	          System.out.println(num1 + " - " + num2 + " = " + result);
	          break;
          
	      case '*':
	          result = num1 + num2;
	          System.out.println(num1 + " * " + num2 + " = " + result);
	          break;
	          
	          
	      case '/':
	          result = num1 + num2;
	          System.out.println(num1 + " / " + num2 + " = " + result);
	          break;

	      default:
	          System.out.println("Invalid operator!");
	          break;
	          
	    }
	    
	    sc.close();
  }

}
