package com.example.ticketmanager.controller;

import com.example.ticketmanager.entity.Ticket;
import com.example.ticketmanager.service.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tickets")
public class TicketController {
private TicketService ticketService;

public TicketController(TicketService theTicketService){
    ticketService = theTicketService;
}

@GetMapping("/list")
    public String listTickets(Model theModel){
    List<Ticket> theTicket = ticketService.findAll();

    theModel.addAttribute("tickets",theTicket);

    return "/tickets/list-tickets";
}
@GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
    Ticket theTicket = new Ticket();

    theModel.addAttribute("ticket",theTicket);
    return "/tickets/ticket-form";
}


@GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("ticketId") int theId, Model theModel){
    Ticket theTicket = ticketService.findById(theId);

    theModel.addAttribute("ticket", theTicket);

    return "/tickets/ticket-form";
}

@PostMapping("/save")
    public String saveTicket(@ModelAttribute("ticket") Ticket theTicket){

    ticketService.save(theTicket);
    return "redirect:/tickets/list";
}

@GetMapping("/delete")
    public String deleteTicket(@RequestParam("ticketId") int theId){
    ticketService.deleteById(theId);
    return "redirect:/tickets/list";
}
}
