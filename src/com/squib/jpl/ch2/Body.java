package com.squib.jpl.ch2;

class Body {

	public long idNum;
	public String name;
	public Body orbits;

	private static long nextID = 0;

	Body() {

		idNum = nextID;
	}

	Body(String bodyName, Body orbitsAround) {

		// Calls above constructor to set idNum

		this();
		name = bodyName;
		orbits = orbitsAround;
	}

	public static void main(String[] args) {

		Body sun = new Body();
		sun.idNum = Body.nextID++;
		sun.name = "Sol";
		sun.orbits = null;

		System.out.println(sun.idNum);

		Body earth = new Body();
		earth.idNum = Body.nextID++;
		earth.name = "Earth";
		earth.orbits = sun;

		System.out.println(earth.idNum);
	}
}
