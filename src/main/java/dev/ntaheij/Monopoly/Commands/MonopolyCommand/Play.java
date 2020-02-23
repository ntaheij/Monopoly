package dev.ntaheij.Monopoly.Commands.MonopolyCommand;

import org.bukkit.entity.Player;

import dev.ntaheij.Monopoly.Utils.GameObjects.IngamePlayer;

public class Play 
{
	public static void execute(Player p)
	{
		IngamePlayer ip = new IngamePlayer(p);	
	}
}
