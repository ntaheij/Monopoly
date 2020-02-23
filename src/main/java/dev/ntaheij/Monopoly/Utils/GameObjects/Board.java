package dev.ntaheij.Monopoly.Utils.GameObjects;

import java.util.ArrayList;
import java.util.List;

public class Board 
{
	public List<BoardField> boardfields = new ArrayList<BoardField>();
	
	public Board()
	{
		intializeFields();
	}
	
	private void intializeFields()
	{
		boardfields.add(new BoardField(BoardFieldType.START, "Start"));
		
		BoardFieldValues bv1 = new BoardFieldValues(6000, 3000, 200, 400, 800, 1000, 1200, 2000);
		boardfields.add(new BoardField(BoardFieldType.STREET, "Dorpstraat", Cities.ONS_DORP, bv1));
	}
}
