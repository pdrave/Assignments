import java.util.ArrayList;
import java.util.*;


public class Q12 
{

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		Max m=(int a[])->{
			for(int i=1;i<a.length;i++)
			{
				list.add(a[i]);
				
			}
			Integer sobj = list.stream().max( (s1,s2)->s1>s2?1:-1).get();
			
       System.out.println("Maximum Number in Array="+sobj);
	};
	
		m.maxArray(new int[] {76,890,876,56,78});
  }
}
