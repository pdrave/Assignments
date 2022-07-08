package ass07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassTest 
{
	public static void main(String[] args)
	{
		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
		Class7 obj=(Class7) ref.getBean("class1bean");
		obj.merge_array();
		
		
	}

}
