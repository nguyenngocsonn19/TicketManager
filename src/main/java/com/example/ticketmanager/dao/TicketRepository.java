package com.example.ticketmanager.dao;

import com.example.ticketmanager.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    public List<Ticket> findAllByOrderByIdAsc();

}
