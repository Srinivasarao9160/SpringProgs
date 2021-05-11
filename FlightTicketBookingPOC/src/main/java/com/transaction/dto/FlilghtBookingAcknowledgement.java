package com.transaction.dto;

import com.transaction.entity.PassengerDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class FlilghtBookingAcknowledgement {

	private String status;
	private double cost;
	private String pnrno;
	private PassengerDetails passengerdetails;
	public FlilghtBookingAcknowledgement() {
		super();
	}
	public FlilghtBookingAcknowledgement(String status, double cost, String pnrno, PassengerDetails passengerdetails) {
		super();
		this.status = status;
		this.cost = cost;
		this.pnrno = pnrno;
		this.passengerdetails = passengerdetails;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getPnrno() {
		return pnrno;
	}
	public void setPnrno(String pnrno) {
		this.pnrno = pnrno;
	}
	public PassengerDetails getPassengerdetails() {
		return passengerdetails;
	}
	public void setPassengerdetails(PassengerDetails passengerdetails) {
		this.passengerdetails = passengerdetails;
	}
	@Override
	public String toString() {
		return "FlilghtBookingAcknowledgement [status=" + status + ", cost=" + cost + ", pnrno=" + pnrno
				+ ", passengerdetails=" + passengerdetails + "]";
	}
	
	
}
