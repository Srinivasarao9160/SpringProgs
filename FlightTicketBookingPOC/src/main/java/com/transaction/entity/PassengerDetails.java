package com.transaction.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "Passenger_Details")
public class PassengerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerid;
	private String name;
	private String email;
	private double cost;
	private String source;
	private String destination;
	private String pickuptime;
	private String arrivaltime;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
	private Date traveldate;
	
	public PassengerDetails() {
		super();
	}
	public PassengerDetails(int passengerid, String name, String email, double cost, String source, String destination,
			String pickuptime, String arrivaltime, Date traveldate) {
		super();
		this.passengerid = passengerid;
		this.name = name;
		this.email = email;
		this.cost = cost;
		this.source = source;
		this.destination = destination;
		this.pickuptime = pickuptime;
		this.arrivaltime = arrivaltime;
		this.traveldate = traveldate;
	}
	public int getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPickuptime() {
		return pickuptime;
	}
	public void setPickuptime(String pickuptime) {
		this.pickuptime = pickuptime;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public Date getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	@Override
	public String toString() {
		return "PassengerDetails [passengerid=" + passengerid + ", name=" + name + ", email=" + email + ", cost=" + cost
				+ ", source=" + source + ", destination=" + destination + ", pickuptime=" + pickuptime
				+ ", arrivaltime=" + arrivaltime + ", traveldate=" + traveldate + "]";
	}
	
	}
	
	


