package com.chadteitsma.springtest.ch4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Spectators {

    @Pointcut("execution(** *(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhones(JoinPoint jp) {
        System.out.println("Before " + jp.getSignature().getName());
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

}
