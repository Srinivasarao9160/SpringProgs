package com.ticket;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ticket.domain.Ticket;
import com.ticket.service.TicketService;

@SpringBootApplication
public class SpringRestFullTicketBookingAppApplication implements CommandLineRunner {
     @Autowired
        private TicketService service;

 

    public static void main(String[] args) {
        SpringApplication.run(SpringRestFullTicketBookingAppApplication.class, args);
    }

 

    @Override
    public void run(String... args) throws Exception {
         Ticket ticket = new Ticket();
         ticket.setPassengername("CHERRY");
         ticket.setEmail("cherrysonu@gmail.com");
         ticket.setSourcestation("Hyderabad");
         ticket.setDestinationstation("bambay");
         ticket.setPhonenumber("9553139699");
         ticket.setBookingDate(new Date(21, 8, 20));
         service.createTicket(ticket);
        
    }

 

}


