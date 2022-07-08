package ass14;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{
		
		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
        Circle cj =(Circle) ref.getBean("que14");
        Square cj1=(Square) ref.getBean("que14a");
        Rectangle cj2=(Rectangle) ref.getBean("que14b");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice Rectangle,Square,Circle,");
        String ch=sc.next();
        
        switch (ch)
        {
        case "Circle": cj.area(12);
                       cj.side();
                       
        case "Square":
			         cj1.area(12);
			         cj1.side();
			         break;
			         
			         
		case "Rectangle":
		                 cj2.area(2, 4);
			             cj2.side();
			             break;
			             
			default: System.out.println("Enter valid");
	     }
	}
	
	
}
        
        
        
      