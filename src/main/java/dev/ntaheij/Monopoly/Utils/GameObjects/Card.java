package dev.ntaheij.Monopoly.Utils.GameObjects;

enum CardType
{
	COMMUNITY_CHEST ("Algemeen Fonds"),
	CHANCE ("Kans");
	
	private final String s;
	
	CardType(String s)
	{
		this.s = s;
	}
	
	public String getName()
	{
		return s;
	}
}

public class Card 
{
	CardType type;
	String name;
	
	public Card(CardType type, String name)
	{
		this.type = type;
		this.name = name;
	}
	
	public String getText() 
	{
		return name;
	}
}
