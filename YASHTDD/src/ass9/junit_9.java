package ass9;

public class junit_9
{
  public static String simbleremove(String str)
  {
	  String convertedstring=str.replaceAll("[^a-z,A-Z,]","");
	  
	  System.out.println(convertedstring);
	  return convertedstring;
	  
  }
  public static void main(String[] args) 
   {
	junit_9.simbleremove("qwer@#hj");
   }
}
