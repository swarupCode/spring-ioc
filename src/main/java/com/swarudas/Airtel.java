package com.swarudas;

public class Airtel implements Sim{
	
	private int id;
	private String size;

	public void setId(int id) {
		this.id = id;
	}

	public void setSize(String size) {
		this.size = size;
	}

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
    
    public void displaySimInfo() {
    	System.out.println("SIM Info: ID - " + id + "; Size - " + size);
    }
}