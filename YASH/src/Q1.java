import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		List<Integer>aslist= new ArrayList<Integer>();
		
		for(int i=0;i<=5;i++)
		{
			int c=sc.nextInt();
			
		}
		
		for(int d:aslist)
		{
			System.out.println(d);
		}
		
		Double avgvalue=aslist.stream().collect(Collectors.averagingDouble(e->e));
		System.out.println("The Average Value Is:"+avgvalue);
		

	}
}