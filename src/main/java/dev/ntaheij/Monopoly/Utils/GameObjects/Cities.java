package dev.ntaheij.Monopoly.Utils.GameObjects;

public enum Cities 
{
	ONS_DORP ("Ons Dorp", "PURPLE"),
	ARNHEM ("Arnhem", "LIGHT_BLUE"),
	HAARLEM ("Haarlem", "PINK"),
	UTRECHT ("Utrecht", "ORANGE"),
	GRONINGEN ("Groningen", "RED"),
	THE_HAGUE ("'s-Gravenhage", "YELLOW"),
	ROTTERDAM ("Rotterdam", "LIGHT_GREEN"),
	AMSTERDAM ("Amsterdam", "DARK_BLUE");
	
	private final String s;
	private final String c;
	
	Cities(String s, String c)
	{
		this.s = s;
		this.c = c;
	}
	
	public String getName()
	{
		return s;
	}
	public String getColor()
	{
		return c;
	}
}
