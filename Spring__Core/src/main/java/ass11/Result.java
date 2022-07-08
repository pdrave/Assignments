package ass11;

public class Result
{
	float Maths;
	float English;
	float Science;
	float Hindi;
	
	public float totalmarks;

	public Result(float maths, float english, float science, float hindi) 
	{
		super();
		Maths = maths;
		English = english;
		Science = science;
		Hindi = hindi;
		this.totalmarks = Maths+English+Science+Hindi;
	}
	
	
	
	
}
