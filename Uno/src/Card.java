
public class Card
	{
	private String icon;
	private String color;
	private int rank;
	
	public Card (String i, String c, int r)
		{
			icon = i;
			color = c;
			rank = r;
		}
	
	public String getIcon()
	{
		return icon;
	}
	
	public void setIcon (String i)
	{
		icon = i;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor (String c)
		{
			color = c;
		}
	
	public int getRank()
	{
		return rank;
	}
	
	public void setRank (int r)
		{
			rank = r;
		}
	
	

	}