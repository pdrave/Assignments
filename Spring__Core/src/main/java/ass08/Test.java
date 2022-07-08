package ass08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args)
	{
		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
		Assi8Item bean= (Assi8Item) ref.getBean("itembean8");
        bean.ascending();
        bean.decending();		
	}
	
	
}
