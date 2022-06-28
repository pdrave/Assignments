import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q3
{
	public static void main(String[] args) 
	{
	   List<String> ref1 = new ArrayList<String>();
	   ref1.add("Pooja");
	   ref1.add("Payal");
	   ref1.add("Laduu");
	   ref1.add("Laduu");
	   ref1.add("Meena");
	   
	   
	   List<String> ref=ref1.stream().distinct().sorted().collect(Collectors.toList());
	   System.out.println(ref);
	}

}
