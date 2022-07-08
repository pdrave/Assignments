package ass10;

public class junit_10
{
   public static String concat(String a[])
   {
	   String res="";
	   
	   for(int p=0; p<a.length;p++)
	   {
		   if(p==a.length-1)
		   res+=a[p];
		 
		   else
		  res+=a[p]+"-";
		   
	   }
	   
	   return res;
	   
   }
}
