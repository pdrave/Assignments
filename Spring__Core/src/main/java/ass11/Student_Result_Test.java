package ass11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Result_Test 
{
	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<>();
		ApplicationContext ref =new ClassPathXmlApplicationContext("ass03/ApplicationContext.xml");
        Student stu1=(Student) ref.getBean("stu1");
        Student stu2=(Student) ref.getBean("stu2");
        Student stu3=(Student) ref.getBean("stu3");
        Student stu4=(Student) ref.getBean("stu4");
        Student stu5=(Student) ref.getBean("stu5");
        
        
       list.add(stu1);
       list.add(stu2);
       list.add(stu3);
       list.add(stu4);
       list.add(stu5);
       
       for (Student stu:list) 
       {
           System.out.println(stu.studentname+ ": "+stu.obj.totalmarks);
       }

       List<Student> sortlist=list.stream().sorted((s1,s2) ->Float.compare(s1.obj.totalmarks, s2.obj.totalmarks)).collect(Collectors.toList());
       System.out.println("Sorted list of Students as per total Marks");

       for(Student stu:sortlist) 
       {
           System.out.println(stu.studentname+ ": "+stu.obj.totalmarks);
       }
       
        
		
		
	}

}
