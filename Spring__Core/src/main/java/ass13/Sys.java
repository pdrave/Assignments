package ass13;

public class Sys 
{
	String moviename;
	String showtime;
	int pot;
	String bic;
	
	public String getMoviename()
	{
		return moviename;
	}
	public void setMoviename(String moviename)
	{
		this.moviename = moviename;
	}
	public String getShowtime()
	{
		return showtime;
	}
	public void setShowtime(String showtime) 
	{
		this.showtime = showtime;
	}
	public int getPot() 
	{
		return pot;
	}
	public void setPot(int pot)
	{
		this.pot = pot;
	}
	public String getBic()
	{
		return bic;
	}
	public void setBic(String bic)
	{
		this.bic = bic;
	}
	
	public void show()
	{
		System.out.println("Name Of The Movie = "+moviename);
		System.out.println("Time Of The Show = "+showtime);
		System.out.println("Price Of Movie Ticket = "+pot);
		System.out.println("Business Score Is = "+bic);
	}
	

}
