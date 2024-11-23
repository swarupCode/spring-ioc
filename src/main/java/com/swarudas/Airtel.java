package com.swarudas;

public class Airtel implements Sim{
	
	public Airtel() {
		System.out.println("Airtel Sim class is being called.");
	}
	
    @Override
    public void calling() {
        System.out.println("Airtel Sim activated for calling.");
    }

    @Override
    public void data() {
        System.out.println("Airtel Sim activated for Data pack.");
    }
}