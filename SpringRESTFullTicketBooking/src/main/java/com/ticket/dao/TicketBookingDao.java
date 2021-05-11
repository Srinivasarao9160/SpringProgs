package com.ticket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.domain.Ticket;

public interface TicketBookingDao  extends JpaRepository<Ticket, Integer>{

}
