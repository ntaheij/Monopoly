package dev.ntaheij.Monopoly.Utils.GameObjects;

import java.util.*;

public class Board 
{
	public List<BoardField> boardfields = new ArrayList<BoardField>();
	public List<Card> chanceCards = new ArrayList<Card>();
	public List<Card> comChestCards = new ArrayList<Card>();
	
	public Board()
	{
		initializeFields();
		shuffleCards(ShuffleType.ALL);
	}
	
	private void initializeFields()
	{
		boardfields.add(new BoardField(BoardFieldType.START, "Start"));
		
		BoardFieldValues bv1 = new BoardFieldValues(6000, 3000, 200, 400, 800, 1000, 1200, 2000);
		boardfields.add(new BoardField(BoardFieldType.STREET, "Dorpstraat", Cities.ONS_DORP, bv1));
	}
	
	private void initializeCards()
	{
		chanceCards.add(new Card(CardType.CHANCE, "Geef iedere speler 100 M"));
	}
	
	public void shuffleCards(ShuffleType type)
	{
		//Check if new
		if(type == ShuffleType.ALL)
		{
			initializeCards();
			Collections.shuffle(chanceCards);
			Collections.shuffle(comChestCards);
		}
		if(type == ShuffleType.CHANCE)
			Collections.shuffle(chanceCards);
		if(type == ShuffleType.CHANCE)
			Collections.shuffle(comChestCards);
	}
}
