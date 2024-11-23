package com.swarudas;

public class Voda implements Sim{
	
	public Voda() {
		System.out.println("Voda Sim class is being called.");
	}
	
    @Override
    public void calling() {
        System.out.println("Voda Sim activated for calling.");
    }

    @Override
    public void data() {
        System.out.println("Voda Sim activated for Data pack.");
    }
}
