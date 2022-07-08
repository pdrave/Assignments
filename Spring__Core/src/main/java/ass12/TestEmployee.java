package ass12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee 
{
	public static void main(String[] args) 
	{

		List<Employee> slist = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);

		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
        Employee ct1 = (Employee) ref.getBean("que12a");
		Employee ct2 = (Employee) ref.getBean("que12b");
		Employee ct3 = (Employee) ref.getBean("que12c");
		Employee ct4 = (Employee) ref.getBean("que12d");
		slist.add(ct1);
		slist.add(ct2);
		slist.add(ct3);
		slist.add(ct4);

		System.out.println("Enter The Department:HRPP,Shift Engineer,Data-Analyst,Sr.Software Engineer");
		String dept1 = sc.next();
		Employee e3=slist.stream().filter(s->s.dept.equals(dept1 )).max((e1,e2)->e1.salary>e2.salary ? 1:-1).get();
	
		
		System.out.println("Name is "+ e3.ename+" has" + " Maximum salary = " + e3.salary);
	    System.out.println("===================================");
		Employee e4 = slist.stream().max((e1, e2) -> e1.salary > e2.salary ? 1 : -1).get();
		System.out.println("Employee has highest salary is "+e4);
	
	}

}
