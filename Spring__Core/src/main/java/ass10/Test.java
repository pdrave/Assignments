package ass10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{

		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/applicationcontext.xml");

        Student student = (Student) ref.getBean("que10");

        student.getStd();
    }
}


