package ass02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    
	public static void main(String[] args)
	{
		
		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
		Average_of_Numbers_Q2 obj=(Average_of_Numbers_Q2) ref.getBean("class1bean");
	    obj.sum();
	    
	}

		
}
