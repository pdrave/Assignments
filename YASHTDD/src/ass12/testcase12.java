package ass12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase12 
{

	@Test
	void test() throws CloneNotSupportedException
	{
		junit_12 s1= new junit_12(1205,"Pooja Drave");
		junit_12 s2=(junit_12)s1.clone();
		assertEquals(true,junit_12.checkClone(s1, s2));
		
		
	}

}
