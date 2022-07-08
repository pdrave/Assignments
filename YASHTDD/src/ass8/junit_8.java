package ass8;

public class junit_8
{

	public static boolean main(int[] js)
	{  
		int a[]={ 1,2,3,4,5,6,7 };  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2!=0)
		{  
		System.out.println(a[i]);  
		}  
		
	    }  
		
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++)
	    {  
		    if(a[i]%2==0)
		   {  
		     System.out.println(a[i]);
		     return true;
		     
		   } 
		    
		}  
		 
		return false;
		
		
		
	}

}
	