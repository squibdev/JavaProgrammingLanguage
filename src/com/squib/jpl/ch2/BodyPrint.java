package com.squib.jpl.ch2;

class BodyPrint {
	public static void main(String[] args) {
		Body sun = new Body("Sol", null);
		Body earth = new Body("Earth", sun);
		System.out.println("Body" + earth.name + " orbits " + earth.orbits.name + " and has ID " + earth.idNum);
	}

}
