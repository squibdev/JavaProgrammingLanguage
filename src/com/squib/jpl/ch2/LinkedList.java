package com.squib.jpl.ch2;

class LinkedList {

	static Object[] list;
	Object nextList;

	LinkedList() {
		
	}

	public static void main(String[] args) {

		Vehicle corvette = new Vehicle();
		Vehicle twinTurbo = new Vehicle();
		Vehicle n350z = new Vehicle();

		list = new Object[3];

		list[0] = corvette;
		list[1] = twinTurbo;
		list[2] = n350z;

		corvette.setBrandName("Cheverolet Corvette");

		System.out.println(list[0]);
	}

}
