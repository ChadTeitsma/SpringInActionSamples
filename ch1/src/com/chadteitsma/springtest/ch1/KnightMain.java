package com.chadteitsma.springtest.ch1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main (String[] args) throws Exception{
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "com/chadteitsma/springtest/ch1/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
