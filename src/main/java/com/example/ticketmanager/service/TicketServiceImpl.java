package com.example.ticketmanager.service;

import com.example.ticketmanager.dao.TicketRepository;
import com.example.ticketmanager.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService{
    private TicketRepository ticketRepository;
    @Autowired
    public TicketServiceImpl(TicketRepository theTicketRepository){
        ticketRepository = theTicketRepository;
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAllByOrderByIdAsc();
    }

    @Override
    public Ticket findById(int theId) {
        Optional<Ticket> result = ticketRepository.findById(theId);

        Ticket theTicket = null;
        if(result.isPresent()){
            theTicket = result.get();
        }else {
            throw new RuntimeException("Did not fine ticket id " +theId);
        }
        return theTicket;
    }

    @Override
    public void save(Ticket theTicket) {
        ticketRepository.save(theTicket);
    }

    @Override
    public void deleteById(int theId) {

        ticketRepository.deleteById(theId);

    }
}
