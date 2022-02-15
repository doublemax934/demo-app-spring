package ru.learnup.spring.demospringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.spring.demospringapp.services.OnlineSalesRegister;


@SpringBootApplication
public class SpringAppApplicationMain {

    public static void main(String[] args) {


        final ConfigurableApplicationContext context = SpringApplication.run(SpringAppApplicationMain.class, args);
//
//        context.getBean(OnlineSalesRegister.class).printAllPerformances();
        OnlineSalesRegister onlineSalesRegister = context.getBean("onlineSalesRegister", OnlineSalesRegister.class);

        onlineSalesRegister.printAllPerformances();
//
//        System.out.println();
//        onlineSalesRegister.addPerformance();
//
//        System.out.println();
//        onlineSalesRegister.printAllPerformances();
//
//        System.out.println();
//        onlineSalesRegister.removePerformance("Кармен");
//        onlineSalesRegister.printAllPerformances();
//
//        System.out.println();
//        onlineSalesRegister.printPerformance("Травиата");
//
//        System.out.println();
//        onlineSalesRegister.changingTicketIdOfPerformance("Садко", 11);
//        onlineSalesRegister.printPerformance("Садко");
//
        onlineSalesRegister.getAllFreeTickets("Садко");
        System.out.println();

        onlineSalesRegister.onlineBuyTicket("Садко", 5, 1500);
//        onlineSalesRegister.getAllFreeTickets("Садко");

        System.out.println();
        onlineSalesRegister.onlineReturnTicket("Садко", 5, 1500);
//        onlineSalesRegister.getAllFreeTickets("Садко");

        context.close();

    }

}
