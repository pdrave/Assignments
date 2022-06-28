import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q05
{
	public static void main(String[] args)
	{
		List<String>names=Arrays.asList("rohankaaee","mohanaa","samokart[papaseef");
		String ref=names.stream().max(Comparator.comparingLong(String::length)).get();
		System.out.println(ref);
		
		
	}

}
