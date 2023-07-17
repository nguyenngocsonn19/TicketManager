package com.example.ticketmanager.service;

import com.example.ticketmanager.entity.Ticket;

import java.util.List;

public interface TicketService {
    public List<Ticket> findAll();
    public Ticket findById(int theId);
    public void save(Ticket theTicket);
    public void deleteById(int theId);
}
