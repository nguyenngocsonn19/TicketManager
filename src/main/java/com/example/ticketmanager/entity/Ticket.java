package com.example.ticketmanager.entity;

import javax.persistence.*;

@Entity
@Table(name ="tickets")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;
    @Column(name="time")
    public String time;

    @Column(name="price")
    public Double price;
    @Column(name="type")
    public String type;

    @Column(name="detail")
    public String details;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Ticket(int id, String time, Double price, String type, String details) {
        this.id = id;
        this.time = time;
        this.price = price;
        this.type = type;
        this.details = details;
    }

    public Ticket(String time, Double price, String type, String details) {
        this.time = time;
        this.price = price;
        this.type = type;
        this.details = details;
    }

    public Ticket(){

    }
}
