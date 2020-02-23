package dev.ntaheij.Monopoly.Utils.GameObjects;

enum BoardFieldType 
{
	START ("Start"),
	STREET ("Straat"),
	STATION ("Station"),
	UTILITY ("Nutsbedrijf"),
	CHANCE ("Kans"),
	COMMUNITY_CHEST ("Algemeen Fonds"),
	PRISON ("Gevangenis"),
	FREE_PARKING ("Vrij parkeren"),
	GO_TO_JAIL ("Ga naar de gevangenis"),
	TAX ("Belastingen");
	
	private final String s;
	
	BoardFieldType(String s)
	{
		this.s = s;
	}
	
	public String getName()
	{
		return s;
	}
}

public class BoardField 
{
	BoardFieldType type;
	String name;
	String city;
	BoardFieldValues bfv;
	IngamePlayer owner;
	
	public BoardField(BoardFieldType type, String name)
	{
		this.type = type;
		this.name = name;
	}
	
	public BoardField(BoardFieldType type, String name, BoardFieldValues bfv)
	{
		this.type = type;
		this.name = name;
		this.bfv = bfv;
	}
	
	public BoardField(BoardFieldType type, String name, String city, BoardFieldValues bfv)
	{
		this.type = type;
		this.name = name;
		this.city = city;
		this.bfv = bfv;
	}
	
	public void setOwner(IngamePlayer ip)
	{
		this.owner = ip;
	}
}
