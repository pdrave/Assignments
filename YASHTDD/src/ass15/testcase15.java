package ass15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class testcase15 
{
	
	@AfterEach
    void tearDown() throws Exception 
	{


    }

	@Test
	void test() 
	{
		
		junit_15 ref = new junit_15(1,"XYZ", 200,500,LocalDate.of(2022,11,23),LocalDate.of(2023, 2, 22));

		assertEquals(true,ref.createObject(ref));
    
		
	}

}
