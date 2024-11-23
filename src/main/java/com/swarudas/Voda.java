package com.swarudas;

public class Voda implements Sim{
	
	private int id;
	private String size;

	public void setId(int id) {
		this.id = id;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
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
    
    public void displaySimInfo() {
    	System.out.println("SIM Info: ID - " + id + "; Size - " + size);
    }
}
