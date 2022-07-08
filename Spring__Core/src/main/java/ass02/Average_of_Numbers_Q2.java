package ass02;

import javax.annotation.PostConstruct;

public class Average_of_Numbers_Q2 
{
	    int num1;
	    int num2;
	    int num3;
	    int num4;
	    int num5;
	   
	    public int getNum1()
	    {
			return num1;
		}
		public void setNum1(int num1) 
		{
			this.num1 = num1;
		}
		public int getNum2() 
		{
			return num2;
		}
		public void setNum2(int num2) 
		{
			this.num2 = num2;
		}
		public int getNum3() {
			return num3;
		}
		public void setNum3(int num3) 
		{
			this.num3 = num3;
		}
		public int getNum4() 
		{
			return num4;
		}
		public void setNum4(int num4)
		{
			this.num4 = num4;
		}
		public int getNum5() 
		{
			return num5;
		}
		public void setNum5(int num5)
		{
			this.num5 = num5;
		}
		
		
		public void sum() 
		{
	        int avg=(num1+num2+num3+num4+num5)/5;

	        System.out.println("Average of Numbers:"+avg);
	    }
		
	    @PostConstruct
	    public void sum2() 
	    {
	    Average_of_Numbers_Q2 obj1=new Average_of_Numbers_Q2();
	    }

}
