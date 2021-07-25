package com.codemer.giftcard.model;

public class CardUser {
	private String cardNumber;
	private String currentBalance;
	public CardUser(String cardNumber, String currentBalance) {
		super();
		this.cardNumber = cardNumber;
		this.currentBalance = currentBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}
	

}
