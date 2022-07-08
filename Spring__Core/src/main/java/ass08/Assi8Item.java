package ass08;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assi8Item 
{

	List<String> itemlist;

    public Assi8Item(List<String> itemlist) 
    {
        super();
        this.itemlist = itemlist;
    }

    void ascending()
    {
        List<Object> asc = itemlist.stream().sorted().collect(Collectors.toList());
    System.out.println("Ascending oder : "+asc);
    }
    void decending()
    {
     List<String>  ittemset=  itemlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
     System.out.println("decending ordr : "+ittemset);
    }

}

	
	

