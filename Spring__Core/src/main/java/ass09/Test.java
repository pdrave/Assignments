package ass09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		
		List<Dis> cityDistList = new ArrayList<Dis>();
        Scanner sc = new Scanner(System.in);
		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
	
		Dis ct1 = (Dis) ref.getBean("que9a");
		Dis ct2 = (Dis) ref.getBean("que9b");
		Dis ct3 = (Dis) ref.getBean("que9c");
		Dis ct4 = (Dis) ref.getBean("que9d");

		cityDistList.add(ct1);
        cityDistList.add(ct2);
        cityDistList.add(ct3);
        cityDistList.add(ct4);
        
        System.out.println("Enter The City Name From:");
        String fc = sc.next();
        
        System.out.println("Enter The City To:");
        String tc = sc.next();
        
        List<Dis> matchedList = cityDistList.stream().filter(c -> c.getFc().equalsIgnoreCase(fc))
                .filter(c -> c.getTc().equalsIgnoreCase(tc)).collect(Collectors.toList());
        
        if (!matchedList.isEmpty()) 
        {
            for (Dis cities : matchedList) 
            {
                System.out.print("distance between "+cities.getFc() +" & "+cities.getTc()+" is "+cities.getDis() + " Km");

             }
            
        } 
        
        else
        System.out.println("Sorry Data Is Not Available");
        
    }

		
}


