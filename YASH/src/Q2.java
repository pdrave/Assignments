import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {

	public static void main(String[] args) 
	{
	 
		List<Integer>slist=Arrays.asList(34,87,87,78,78);
		List<Integer> ab=slist.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ab);

	}

}
