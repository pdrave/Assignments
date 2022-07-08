package ass05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FindMax_Test_Q5
{
	public static void main(String[] args)
	{
		ApplicationContext ObjCtx=new ClassPathXmlApplicationContext("ass03/applicationcontext.xml");
		FindMax_Q5 obj=(FindMax_Q5) ObjCtx.getBean("ibean5");
		obj.maxNum();
		
		
	}

}
