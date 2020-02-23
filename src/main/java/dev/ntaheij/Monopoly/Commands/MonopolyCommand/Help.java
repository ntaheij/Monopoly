package dev.ntaheij.Monopoly.Commands.MonopolyCommand;

import org.bukkit.entity.Player;

import dev.ntaheij.Monopoly.Utils.Messages;
import dev.ntaheij.Monopoly.Utils.Permissions;

public class Help 
{
	public static void execute(Player p)
	{
		p.sendMessage(Messages.HEADER.getMessage());
		
		if(p.hasPermission(Permissions.PLAYER.asPermission()))
			p.sendMessage(Messages.HELP_PLAYER.getMessage());
		
		if(p.hasPermission(Permissions.ADMIN.asPermission()))
			p.sendMessage(Messages.HELP_ADMIN.getMessage());		
	}
}
