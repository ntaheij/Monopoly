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
	
	public int getBuyvalue() {
		return buyvalue;
	}

	public void setBuyvalue(int buyvalue) {
		this.buyvalue = buyvalue;
	}

	public int getMortagevalue() {
		return mortagevalue;
	}

	public void setMortagevalue(int mortagevalue) {
		this.mortagevalue = mortagevalue;
	}

	public int getRentvalue() {
		return rentvalue;
	}

	public void setRentvalue(int rentvalue) {
		this.rentvalue = rentvalue;
	}

	public int getRentvalue1() {
		return rentvalue1;
	}

	public void setRentvalue1(int rentvalue1) {
		this.rentvalue1 = rentvalue1;
	}

	public int getRentvalue2() {
		return rentvalue2;
	}

	public void setRentvalue2(int rentvalue2) {
		this.rentvalue2 = rentvalue2;
	}

	public int getRentvalue3() {
		return rentvalue3;
	}

	public void setRentvalue3(int rentvalue3) {
		this.rentvalue3 = rentvalue3;
	}

	public int getRentvalue4() {
		return rentvalue4;
	}

	public void setRentvalue4(int rentvalue4) {
		this.rentvalue4 = rentvalue4;
	}

	public int getRentvalueh() {
		return rentvalueh;
	}

	public void setRentvalueh(int rentvalueh) {
		this.rentvalueh = rentvalueh;
	}
}
