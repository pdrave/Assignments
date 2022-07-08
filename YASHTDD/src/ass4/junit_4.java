package ass4;

public class junit_4
{
	    public static int NthArmstrong(int n)
		{
			int count=0;
			
			for(int i=1;i <=Integer.MAX_VALUE;i++)
			{
				int num=i, rem, digit=0, sum=0;
				
				num=i;
				
				digit =(int)Math.log(num) + 1;
				
				while(num>0)
				{
					rem=num%10;
					sum=sum + (int)Math.pow(rem, digit);
					num= num/10;
					
				}
				
				if(i == sum)
					count++;
				if(count == n)
					return i;
				
					
			}
			
			return n;
			
		}

	}



