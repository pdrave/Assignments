package ass14;

public class Circle implements Shape
{
	@Override
	public void area(int a)
	{
		double area;
		System.out.println("Area Of Circle");
		System.out.println(area=3.14*(a*a));
	}
	
	
	@Override
    public void side()
    {
		System.out.println("Side Of The Circle"+0);
    }
	
	
}
