import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test 
{

	public static void main(String[] args) 
	{
	  List<Employee> emplist= new ArrayList<>();
	  emplist.add(new Employee(1,"Pooja"));
	  emplist.add(new Employee(2,"Payal"));
	  emplist.add(new Employee(3,"Ashish"));
	  emplist.add(new Employee(4,"Mahesh"));
	  emplist.add(new Employee(5,"Yogesh"));
	  emplist.add(new Employee(6,"Vikas"));
	  emplist.add(new Employee(7,"Pranav"));
	  emplist.add(new Employee(8,"Likhit"));
	  emplist.add(new Employee(9,"Mahya"));
	  
	  System.out.println("Converting list to map===");
	  Map<Integer,String> map=emplist.stream().collect(Collectors.toMap(E1->E1.getId(),E2->E2.getName()));
	  System.out.println(map);
	  
	  System.out.println("Converting List To Set");
	  
	  Set<Employee> Set= emplist.stream().collect(Collectors.toSet());
	  for(Employee emp: Set)
	
      System.out.println("Employee id=" +emp.id + " Employee name =" +emp.name);
	  
	
	  }
	  
	}

