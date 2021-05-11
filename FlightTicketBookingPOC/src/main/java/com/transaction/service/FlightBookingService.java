package com.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.dao.PassengerDetailsDao;
import com.transaction.dao.PaymentDetailsDao;
import com.transaction.dto.FlightBookingRequest;
import com.transaction.dto.FlilghtBookingAcknowledgement;
import com.transaction.entity.PassengerDetails;
import com.transaction.entity.PaymentDetails;
import com.transaction.util.PaymentUtils;

@Service
public class FlightBookingService {
	@Autowired
	private PassengerDetailsDao passengerdetailsdao;
	@Autowired
	private PaymentDetailsDao paymentdetailsdao;
	
	
	
	public FlilghtBookingAcknowledgement flightbookingacknowledgement(FlightBookingRequest request) {
		
		PassengerDetails passengerdetails=request.getPassengerDetails();
		passengerdetails=passengerdetailsdao.save(passengerdetails);
		
		PaymentDetails paymentdetails = request.getPaymentDetails();
		PaymentUtils.validateCreditLimit(paymentdetails.getAccountno(),passengerdetails.getCost());
		
		paymentdetails.setPassengerid(passengerdetails.getPassengerid());
		paymentdetails.setAmount(passengerdetails.getCost());
		paymentdetailsdao.save(paymentdetails);
		
		return new FlilghtBookingAcknowledgement("sryt", 0, "fgs", passengerdetails);
		
	}
	
	

}
