package com.exam;

public class Order {
	Order [] order = new Order[2];
	int value;
	public Order(int value) {
				this.value = value;
	}
	public String get() {
		String [] o = {"Taipei","TaiChung"};
		String [] d = {"TaiChung", "Taipei"};
		String [] p = {"37","285"};
		String [] q = {"2", "1"};
		int number = value;
		return o[number] + o[number] + p[number] + q[number];
		
	public Order() {
		for (int i = 1; i <3; i++) {
			order[i] = new Order(i);
		}
	
}



	
	
	
	public void print() {
		for (int i=0 ; i < 3; i++ ) {
		System.out.println(order[i].value);
		}
	}
}