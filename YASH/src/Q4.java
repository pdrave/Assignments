import java.util.Arrays;
import java.util.List;

public class Q4 
{

	public static void main(String[] args) 
	{
       List<Integer> slist=Arrays.asList(10,200,3000,40000);
       
       Integer ref =slist.stream().max(Integer::compare).get();
       System.out.println("Maximum Number Is :"+ref);
       

	}

}
