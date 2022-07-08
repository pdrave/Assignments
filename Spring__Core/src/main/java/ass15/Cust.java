package ass15;

public class Cust 
{
	int id;
	String custname;
	Item itm;
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getCustname()
	{
		return custname;
	}
	public void setCustname(String custname)
	{
		this.custname = custname;
	}
	public Item getItm()
	{
		return itm;
	}
	public void setItm(Item itm)
	{
		this.itm = itm;
	}
	
	public void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Custname:"+custname);
		System.out.println("Item Id:"+itm.id);
		System.out.println("Item Name:"+itm.iname);
		System.out.println("Item price = "+itm.price);
		System.out.println("catagory name is = "+itm.cat.categoryname);
		
	}

}
