package ass04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest
{
	public static void main(String args[])
	    {
	        @SuppressWarnings("resource")
			ApplicationContext ObjCtx=new ClassPathXmlApplicationContext("ass03/applicationcontext.xml");
	        Employee Objemp= (Employee)ObjCtx.getBean("emp");
	        Objemp.printEmp();
	    }
}

