package ass14;

public class Shape_Fac
{
	
		public static Shape getCircleObject() 
		{

			return new Circle();

		}

		public static Shape getSquareObject() 
		{

			return new Square();

		}

		public static Shape getRectangleObject() 
		{

			return new Rectangle();

		}

}

