package ass06;

public class Vowel_Q6 
{
   public void checkVowel(String str)
   {
	   
	   str.toLowerCase();
	   str=str.replaceAll("[aeiouAEIOU]","");
	   System.out.println("Without Vowel String:"+str);
	   
   }
}
