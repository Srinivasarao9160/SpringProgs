package com.transaction.dto;

import com.transaction.entity.PassengerDetails;
import com.transaction.entity.PaymentDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class FlightBookingRequest {

	private PassengerDetails passengerdetails;
	private PaymentDetails paymentdetails;
	
	
	
	public FlightBookingRequest() {
		super();
	}
	
  public FlightBookingRequest(PassengerDetails passengerdetails, PaymentDetails paymentdetails) {
		super();
		this.passengerdetails = passengerdetails;
		this.paymentdetails = paymentdetails;
	}
  



	public PassengerDetails getPassengerdetails() {
	return passengerdetails;
}

public void setPassengerdetails(PassengerDetails passengerdetails) {
	this.passengerdetails = passengerdetails;
}

public PaymentDetails getPaymentdetails() {
	return paymentdetails;
}

public void setPaymentdetails(PaymentDetails paymentdetails) {
	this.paymentdetails = paymentdetails;
}


	@Override
public String toString() {
	return "FlightBookingRequest [passengerdetails=" + passengerdetails + ", paymentdetails=" + paymentdetails + "]";
}

	public PassengerDetails getPassengerDetails() {
		// TODO Auto-generated method stub
		return passengerdetails;
	}


	public PaymentDetails getPaymentDetails() {
		// TODO Auto-generated method stub
		return paymentdetails;
	}
}
