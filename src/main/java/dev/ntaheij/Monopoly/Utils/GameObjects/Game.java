package dev.ntaheij.Monopoly.Utils.GameObjects;

import java.util.ArrayList;
import java.util.List;

public class Game 
{
	Board board;
	int freeParkingAmount;

	public List<IngamePlayer> ingamePlayers = new ArrayList<IngamePlayer>();
	
	int currentPlayer;
	
	public Game()
	{
		board = new Board();
		freeParkingAmount = 0;
	}
}
