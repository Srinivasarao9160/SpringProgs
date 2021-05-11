package com.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.dto.FlightBookingRequest;
import com.transaction.dto.FlilghtBookingAcknowledgement;
import com.transaction.service.FlightBookingService;

@SpringBootApplication
@RestController
public class FlightTicketBookingPocApplication {
	
	@Autowired
	private FlightBookingService service;

	@PostMapping("/bookingticket")
	public FlilghtBookingAcknowledgement flightbookingacknowledgement(@RequestBody FlightBookingRequest requset) {
		return service.flightbookingacknowledgement(requset);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FlightTicketBookingPocApplication.class, args);
	}

}
