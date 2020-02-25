package dev.ntaheij.Monopoly.Utils.GameObjects;

public enum ShuffleType 
{
	ALL (0),
	CHANCE (1),
	COMMUNITY_CHEST (2);
	
	private final int s;
	
	ShuffleType(int s)
	{
		this.s = s;
	}
	
	public int getID()
	{
		return s;
	}
}
