package ru.learnup.spring.demospringapp.services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

public class OnlineSalesRegister {

    private String name;
    private Map<String, TheatricalPerformance> mainPerformancesList = new HashMap<>();

    public OnlineSalesRegister(String name)
    {
        this.name = name;
        this.mainPerformancesList.put("Князь Игорь",new TheatricalPerformance("Князь Игорь", "10.03.22_19.00", "6+",1500,1000,500, 1));
        this.mainPerformancesList.put("Руслан и Людмила",new TheatricalPerformance("Руслан и Людмила", "20.03.22_19.00", "8+",1500, 1000, 500, 2));
        this.mainPerformancesList.put("Кармен",new TheatricalPerformance("Кармен", "27.03.22_19.00", "12+",1500, 1000, 500, 3));
        this.mainPerformancesList.put("Садко",new TheatricalPerformance("Садко", "05.04.22_19.00", "6+",1500, 1000,500, 4));
        this.mainPerformancesList.put("Травиата",new TheatricalPerformance("Травиата", "15.04.22_19.00", "7+",1500, 1000, 500, 5));
    }

//    public void addPerformance (String title, TheatricalPerformance performance) {
//        if (mainPerformancesList.containsKey(title)) {
//            mainPerformancesList.replace(title, performance);
//        } else mainPerformancesList.put(title, performance);
//    }
    public void addPerformance () {
        TheatricalPerformance performance = new TheatricalPerformance();
        System.out.println("Добавление премьеры:");
        System.out.println("Введите название");
        Scanner scan = new Scanner(System.in);
        performance.setTitle(scan.nextLine());
        System.out.println("Введите дату и время");
        performance.setDateAndTime(scan.nextLine());
        System.out.println("Введите возраст");
        performance.setAgeCategory(scan.nextLine());
        System.out.println("Введите цену дорогих билетов");
        performance.setTicketPrice1(Integer.parseInt(scan.nextLine()));
        System.out.println("Введите цену билетов средней стоимости");
        performance.setTicketPrice2(Integer.parseInt(scan.nextLine()));
        System.out.println("Введите цену дешёвых билетов");
        performance.setTicketPrice3(Integer.parseInt(scan.nextLine()));
        System.out.println("Введите ID идентификатор билета");
        performance.setTicketId(Integer.parseInt(scan.nextLine()));


        if (mainPerformancesList.containsKey(performance.getTitle())) {
            mainPerformancesList.replace(performance.getTitle(), performance);
        } else mainPerformancesList.put(performance.getTitle(), performance);
    }

    public Map<String, TheatricalPerformance> getMainPerformancesList() {
        return mainPerformancesList;
    }

    public void removePerformance (String title){
        if (mainPerformancesList.containsKey(title)){
            mainPerformancesList.remove(title);
        } else System.out.println("нет такого представления");
    }

    public void changingAgeCategoryOfPerformance (String title, String ageCategory){
        if (mainPerformancesList.containsKey(title)){
            mainPerformancesList.get(title).setAgeCategory(ageCategory);
        } else System.out.println("нет такого представления");
    }

    public void changingDateAndTimeOfPerformance (String title, String dateAndTime){
        if (mainPerformancesList.containsKey(title)){
            mainPerformancesList.get(title).setDateAndTime(dateAndTime);
        } else System.out.println("нет такого представления");
    }


    public void changingTicketPrice1OfPerformance (String title, int ticketPrice1){
        if (mainPerformancesList.containsKey(title)){
            mainPerformancesList.get(title).setTicketPrice1(ticketPrice1);
        } else System.out.println("нет такого представления");
    }

    public void changingTicketPrice2OfPerformance (String title, int ticketPrice2){
        if (mainPerformancesList.containsKey(title)){
            mainPerformancesList.get(title).setTicketPrice2(ticketPrice2);
        } else System.out.println("нет такого представления");
    }

    public void changingTicketPrice3OfPerformance (String title, int ticketPrice3){
        if (mainPerformancesList.containsKey(title)){
            mainPerformancesList.get(title).setTicketPrice3(ticketPrice3);
        } else System.out.println("нет такого представления");
    }

    public void changingTicketIdOfPerformance (String title, int ticketId){
        if (mainPerformancesList.containsKey(title)){
            mainPerformancesList.get(title).setTicketId(ticketId);
        } else System.out.println("нет такого представления");
    }


    public void printPerformance(String title){
        if (mainPerformancesList.containsKey(title)){
            System.out.println(mainPerformancesList.get(title).toString());
        } else System.out.println("нет такого представления");
    }


    public void printAllPerformances(){
        System.out.println(name + ":");
        for (String name: mainPerformancesList.keySet()){

//            String key =name.toString();
            String value = mainPerformancesList.get(name).toString();
            System.out.println(value);
        }
    }

    public void getAllFreeTickets (String title) {
        if (mainPerformancesList.containsKey(title)){
            List<Ticket> performanceTicketList = mainPerformancesList.get(title).getTicketList();
            System.out.println("Список билетов на оперу \'" + title + "\'");
            for (Ticket ticket: performanceTicketList){
                System.out.println(ticket);
            }
        } else System.out.println("нет такого представления");
    }

    public void onlineBuyTicket (String title,int seatNumber, int price) {
        if (mainPerformancesList.containsKey(title)) {
            mainPerformancesList.get(title).buyTicket(seatNumber, price);
            System.out.println("Вы купили билет на оперу: \'" + title + "\', цена билета: " + price + ", номер места в зале: " + seatNumber);
        } else System.out.println("нет такого билета");
    }

    public void onlineReturnTicket (String title,int seatNumber, int price) {
        if (mainPerformancesList.containsKey(title)) {
            mainPerformancesList.get(title).returnTicket(seatNumber, price);
            System.out.println("Вы вернули билет на оперу: \'" + title + "\', цена билета: " + price + ", номер места в зале: " + seatNumber);
        } else System.out.println("нет такого билета");
    }


}

