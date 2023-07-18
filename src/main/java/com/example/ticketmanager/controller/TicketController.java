package com.example.ticketmanager.controller;

import com.example.ticketmanager.entity.Ticket;
import com.example.ticketmanager.service.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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
        List<Ticket> theTicket = ticketService.getAllTicket();

        theModel.addAttribute("tickets", theTicket);

        return "/tickets/list-tickets";
    }


    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Ticket theTicket = new Ticket();

        theModel.addAttribute("ticket", theTicket);

        return "/tickets/ticket-form";
    }
    @GetMapping("/showRegistrationForm")
    public String showRegistrationForm(Model theModel) {
        // Logic to handle the registration form display
        return "registration"; // Return the name of the registration form Thymeleaf template
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("ticketId") int theId, Model theModel) {
        Ticket theTicket = ticketService.getTicketById(theId);

        theModel.addAttribute("ticket", theTicket);

        return "/tickets/ticket-form";
    }

    @PostMapping("/save")
    public String saveTicket(@ModelAttribute("ticket") Ticket theTicket) {
        ticketService.save(theTicket);
        return "redirect:/tickets/list";
    }

    @GetMapping("/delete")
    public String deleteTicket(@RequestParam("ticketId") int theId) {
        ticketService.deleteTicket(theId);
        return "redirect:/tickets/list";
    }
    @GetMapping("/searchTicketById")
    public String searchTicketById(@RequestParam("ticketId") int theId, Model theModel) {
        Ticket theTicket = ticketService.getTicketById(theId);

        theModel.addAttribute("tickets", Collections.singletonList(theTicket));

        return "/tickets/list-tickets";
    }

}