package com.ticket.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table(name ="ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticketId")
	private Integer ticketid;
	
	@Column(name = "passengerName")
	private String passengername;
	
	@Column(name = "sourceStation")
	private String sourcestation;
	
	@Column(name = "destinationStation")
	private String destinationstation;
	
	@Column(name = "booking_date")
	private Date bookingDate;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phoneNumber")
	private String phonenumber;

	public Integer getTicketid() {
		return ticketid;
	}

	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}

	public String getPassengername() {
		return passengername;
	}

	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}

	public String getSourcestation() {
		return sourcestation;
	}

	public void setSourcestation(String sourcestation) {
		this.sourcestation = sourcestation;
	}

	public String getDestinationstation() {
		return destinationstation;
	}

	public void setDestinationstation(String destinationstation) {
		this.destinationstation = destinationstation;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	

}
