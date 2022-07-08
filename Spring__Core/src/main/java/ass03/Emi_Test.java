package ass03;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emi_Test 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
		Emi_Q3 obj1=(Emi_Q3) ref.getBean("ibean3");
		System.out.println("Interest Rate"+obj1.rate+"%");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Amount");
		float amount=sc.nextFloat();
		
		System.out.println("Enter Validity In Years");
		int validity=sc.nextInt();
		int validityinmonth=validity*12;
		
		double TPA=amount +((amount*obj1.rate)/100)*validity;
		System.out.println("Total Payable Amount:"+TPA);
		
		double emi=TPA/validityinmonth;
		System.out.println("Emi:"+emi);
		
		
	}

}
