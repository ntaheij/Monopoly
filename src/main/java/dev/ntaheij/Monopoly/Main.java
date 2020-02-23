package dev.ntaheij.Monopoly;

import org.bukkit.plugin.java.JavaPlugin;

import dev.ntaheij.Monopoly.Commands.MonopolyCommand.MonopolyCommand;

public class Main extends JavaPlugin
{
	public void onEnable()
	{	
		getCommand("monopoly").setExecutor(new MonopolyCommand());
		System.out.println("[Monopoly] Done!");
	}
	public void onDisable()
	{
		System.out.println("[Monopoly] Closed!");
	}
}
