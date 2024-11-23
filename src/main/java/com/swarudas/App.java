package com.swarudas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//    System.out.println("Config loaded");
//    Airtel airtelObject = (Airtel) context.getBean("airtel");
    Sim simObject = context.getBean("sim", Sim.class);
    simObject.calling();
    simObject.data();
    simObject.displaySimInfo();
  }
}
