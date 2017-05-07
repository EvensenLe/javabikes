package model;


public class CreditCard {


	private String cardType, cardMonthYear, cardName, cardNumber, cardSecurityNumber;

	//CONSTRUCTOR
	public CreditCard(){

	}

	public CreditCard (String cardType, String cardMonthYear, String cardName, String cardNumber, String cardSecurityNumber) {

		this.cardType = cardType;
		this.cardMonthYear = cardMonthYear;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.cardSecurityNumber = cardSecurityNumber;

	}

	//GENERATE GETTERS AND SETTERS

	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardMonthYear() {
		return cardMonthYear;
	}
	public void setCardMonthYear(String cardMonthYear) {
		this.cardMonthYear = cardMonthYear;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardSecurityNumber() {
		return cardSecurityNumber;
	}
	public void setCardSecurityNumber(String cardSecurityNumber) {
		this.cardSecurityNumber = cardSecurityNumber;
	}
	//STRING METHOD TO DISPLAY CREDIT CARD DETAILS
	public String displayCreditCard() {
		return ("Name: " + this.getCardName() + System.lineSeparator() + "Card Number: " + this.getCardNumber().substring(0,4) + " XXXX XXXX XXXX" + System.lineSeparator());
	}
}
