package dev.ntaheij.Monopoly.Utils;

public enum Messages 
{
	HEADER ("§4---- §cMonopoly §4----"),
	HELP_PLAYER ("§8User Commands: \n§4- §c/Monopoly cmd1\n§4- §c/Monopoly cmd2"),
	HELP_ADMIN ("§8Admin Commands: \n§4- §c/Monopoly cmd3\n§4- §c/Monopoly cmd4");
	
	private final String msg;
	
	Messages(String msg)
	{
		this.msg = msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
}
