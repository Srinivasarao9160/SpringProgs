package com.transaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "Payment_Details")
public class PaymentDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String accountno;
	private double amount;
	private String cardtype;
	private int passengerid;
	
	public PaymentDetails() {
		super();
	}

	public PaymentDetails(String accountno, double amount, String cardtype, int passengerid) {
		super();
		this.accountno = accountno;
		this.amount = amount;
		this.cardtype = cardtype;
		this.passengerid = passengerid;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public int getPassengerid() {
		return passengerid;
	}

	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}

	@Override
	public String toString() {
		return "PaymentDetails [accountno=" + accountno + ", amount=" + amount + ", cardtype=" + cardtype
				+ ", passengerid=" + passengerid + "]";
	}
	
	
	
	

}
