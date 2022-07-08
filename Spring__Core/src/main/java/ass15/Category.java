package ass15;

public class Category
{
	String categoryname;

	public String getCategoryname() 
	{
		return categoryname;
	}

	public void setCategoryname(String categoryname) 
	{
		this.categoryname = categoryname;
	}
	
	public void catshow()
	{
		System.out.println("Category Name Is:"+categoryname);
	}

}
