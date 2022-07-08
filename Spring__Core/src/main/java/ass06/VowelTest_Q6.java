package ass06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VowelTest_Q6 
{
	public static void main(String[] args)
	{
		ApplicationContext ref=new ClassPathXmlApplicationContext("ass03/applicationcontext.xml");
		Vowel_Q6 obj=(Vowel_Q6) ref.getBean("ibean6");
		obj.checkVowel("Pooja Drave");
		
		
		
	}

}
