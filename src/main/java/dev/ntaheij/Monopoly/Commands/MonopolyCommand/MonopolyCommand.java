package dev.ntaheij.Monopoly.Commands.MonopolyCommand;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MonopolyCommand implements CommandExecutor
{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(cmd.getName().equalsIgnoreCase("monopoly"))
		{
			if(!(sender instanceof Player))
			{
				System.out.println("[Monopoly] You have to be a player for this command.");
				return true;
			}

			Player p = (Player)sender;
			
			if(args.length == 0)
			{
				Help.execute(p);
			}
			if(args[0].equalsIgnoreCase("play"))
			{
				Play.execute(p);
			}
			if(args[0].equalsIgnoreCase("join"))
			{
				Join.execute(p);
			}
		}
		return true;
	}

}
