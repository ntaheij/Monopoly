package dev.ntaheij.Monopoly.Utils.GameObjects;

import org.bukkit.entity.Player;

public class IngamePlayer 
{	
	Player p;
	int cash, loan, boardPos;
	boolean bankrupt, imprisoned;

	public IngamePlayer(Player p)
	{
		this.p = p;
	}
	
	//Getters & Setters
	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public int getLoan() {
		return loan;
	}

	public void setLoan(int loan) {
		this.loan = loan;
	}

	public int getBoardPos() {
		return boardPos;
	}

	public void setBoardPos(int boardPos) {
		this.boardPos = boardPos;
	}

	public boolean isBankrupt() {
		return bankrupt;
	}

	public void setBankrupt(boolean bankrupt) {
		this.bankrupt = bankrupt;
	}

	public boolean isImprisoned() {
		return imprisoned;
	}

	public void setImprisoned(boolean imprisoned) {
		this.imprisoned = imprisoned;
	}
}
