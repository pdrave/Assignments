package ass2;

public class junit_2
{
       public static boolean pal(String p1, String p2)
      {
           String rev = "";

        for (int a = p1.length() - 1; a >= 0; a--) {
           	rev = rev + p1.charAt(a);
      }
          if (rev.equals(p1) && rev.equals(p2))
          {
            return true;
          } 
          else 
          {
           return false;
          }



}

   public static void main(String[] args) 
   	{
   System.out.println(junit_2.pal("kayak", "kayak"));
   	}



}