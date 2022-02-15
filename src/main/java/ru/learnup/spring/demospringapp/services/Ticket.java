package ru.learnup.spring.demospringapp.services;

import org.springframework.context.annotation.Scope;


public class Ticket {
    private String ticketTitle;
    private int price;
    private int id;
    private String status;
    private  int seatNumber;


    public Ticket(String ticketTitle, int price, int id, int seatNumber) {
        this.ticketTitle = ticketTitle;
        this.price = price;
        this.id = id;
        this.status = "В продаже";
        this.seatNumber=seatNumber;
    }

    public int getPrice() {
        return price;
    }

    public String buy (int price){
        if(this.price == price){
        this.status = "Продан";
        }
        return status;
    }

    public String ticketRefund (int price){
        if(this.price == price){
            this.status = "В продаже";
        }
        return status;
    }

    @Override
    public String toString() {
        return ticketTitle+ "{" +
                "Цена: " + price +
                ", номер места: " + seatNumber +
                ", статус: '" + status + '\'' +
                '}';
    }
}
