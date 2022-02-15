package ru.learnup.spring.demospringapp.aspects;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotifierAspect {


    @After("execution(public void ru.learnup.spring.demospringapp.services.OnlineSalesRegister.onlineBuyTicket (String,int,int))")
    public void afterbuyTicketAdvice(){
        System.out.println("afterbuyTicketAdvice()--> отправил сообщение о покупке билета");
    }

    @After("execution(public void ru.learnup.spring.demospringapp.services.OnlineSalesRegister.onlineReturnTicket (String,int,int))")
    public void afterReturnTicketAdvice(){
        System.out.println("afterReturnTicketAdvice()--> отправил сообщение о возврате билета");
    }
}
