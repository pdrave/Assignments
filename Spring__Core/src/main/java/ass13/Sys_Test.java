package ass13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sys_Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
		Sys i1=(Sys) ref.getBean("CustID");
		i1.show();
		
	}
		
}


