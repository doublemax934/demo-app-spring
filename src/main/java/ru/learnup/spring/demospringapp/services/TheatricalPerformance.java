package ru.learnup.spring.demospringapp.services;

import java.util.ArrayList;
import java.util.List;

public class TheatricalPerformance {

    private String title;
    private String dateAndTime;
    private String ageCategory;
    private int numberOfSeats;
    private int ticketPrice1;
    private int ticketPrice2;
    private int ticketPrice3;
    private int ticketId;
    private  int seatNumber = 0;
    private List<Ticket> ticketList = new ArrayList<>();


    public TheatricalPerformance(String title, String dateAndTime, String ageCategory, int ticketPrice1,
                                 int ticketPrice2, int ticketPrice3, int ticketId) {
        this.title = title;
        this.dateAndTime = dateAndTime;
        this.ageCategory = ageCategory;
        this.ticketPrice1 = ticketPrice1;
        this.ticketPrice2 = ticketPrice2;
        this.ticketPrice3 = ticketPrice3;
        this.ticketId = ticketId;

        for (int i = 0; i < 10; i ++){

            this.ticketList.add(new Ticket(title, ticketPrice1, ticketId, (seatNumber = i +1)));
        }
        for (int i = 10; i < 20; i ++){
            this.ticketList.add(new Ticket(title, ticketPrice2, ticketId, (seatNumber = i +1)));
        }
        for (int i =20; i < 30; i ++){
            this.ticketList.add(new Ticket(title, ticketPrice3, ticketId, (seatNumber = i +1)));
        }
        this.numberOfSeats = ticketList.size();

    }

    public TheatricalPerformance (){
        for (int i = 0; i < 10; i ++){
            this.ticketList.add(new Ticket(title, ticketPrice1, ticketId, (seatNumber = i +1)));
        }
        for (int i = 10; i < 20; i ++){
            this.ticketList.add(new Ticket(title, ticketPrice2, ticketId, (seatNumber = i +1)));
        }
        for (int i =20; i < 30; i ++){
            this.ticketList.add(new Ticket(title, ticketPrice3, ticketId, (seatNumber = i +1)));
        }
        this.numberOfSeats = ticketList.size();
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public void setTicketPrice1(int ticketPrice1) {
        this.ticketPrice1 = ticketPrice1;
    }

    public void setTicketPrice2(int ticketPrice2) {
        this.ticketPrice2 = ticketPrice2;
    }

    public void setTicketPrice3(int ticketPrice3) {
        this.ticketPrice3 = ticketPrice3;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getNumberOfTickets() {
        System.out.println("Количество свободных мест: " + numberOfSeats);
        return numberOfSeats;
    }

    public String getTitle() {
        return title;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void buyTicket (int seatNumber, int price){
        ticketList.get((seatNumber-1)).buy(price);
    }

    public void returnTicket (int seatNumber, int price){
        ticketList.get((seatNumber-1)).ticketRefund(price);
    }

    @Override
    public String toString() {
        return "{Название: '"+ title + '\'' +
                ", Дата и время='" + dateAndTime + '\'' +
                ", Количество мест=" + numberOfSeats +
                ", Возрастная категория='" + ageCategory + '\'' +
                ", Стоимость билетов: " + ticketPrice1 + "руб., " + ticketPrice2 + "руб., " + ticketPrice3 + "руб., " +
                "номер группы билетов: " + ticketId +
                '}';
    }
}
