package ass15;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	
	public static void main(String[] args) 
	{   
		
		List<Cust>slist=new ArrayList<Cust>();
		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
		Cust c=(Cust)ref.getBean("Customerid");
		c.display();
		

	}


}
