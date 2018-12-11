package com.exam;

public class Order {
	String origin;
	String destination;
	int price;
	int quantity;
	
	public void Ticket (String origin, String destination, int price , int quantity){
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.quantity = quantity;
		
	}

	public void print(){
	//	System.out.print(ticket() + tatal);
	}
	
}
