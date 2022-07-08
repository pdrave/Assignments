package ass1;

public class junit_1
{
	public static int findHCF(int a, int b)
	{
		int hcf=0;
		int i=1;
		
		while(i <= a && i<=b)
		{
			if(a% i==0 && b % i==0)
			hcf=i;
			i++;
			
		}
		
		return hcf;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(junit_1.findHCF(200,570));
	}

}
