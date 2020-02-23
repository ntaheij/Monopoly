package dev.ntaheij.Monopoly.Utils.GameObjects;

public class BoardFieldValues 
{
	int buyvalue, mortagevalue, rentvalue, rentvalue1, rentvalue2, rentvalue3, rentvalue4, rentvalueh;
	
	public BoardFieldValues(int buyvalue, int mortagevalue)
	{
		this.buyvalue = buyvalue;
		this.mortagevalue = mortagevalue;
	}
	
	public BoardFieldValues(int buyvalue, int mortagevalue,
			int rentvalue, int rentvalue1, int rentvalue2, int rentvalue3, int rentvalue4, int rentvalueh)
	{
		this.buyvalue = buyvalue;
		this.mortagevalue = mortagevalue;
		this.rentvalue = rentvalue;
		this.rentvalue1 = rentvalue1;
		this.rentvalue2 = rentvalue2;
		this.rentvalue3 = rentvalue3;
		this.rentvalue4 = rentvalue4;
		this.rentvalueh = rentvalueh;
	}
}
