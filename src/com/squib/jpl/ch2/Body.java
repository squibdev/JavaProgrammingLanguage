package com.squib.jpl.ch2;

class Body {

	public long idNum;
	private static long nextID = 0;

	public String name;
	public Body orbits;

	Body() {

		idNum = nextID;
		nextID++;
	}

	/** Invokes two-argument Body constructor, setting orbits to null */
	Body(String bodyName) {

		this(bodyName, null);
	}

	Body(Body other) {

		idNum = other.idNum;
		name = other.name;
		orbits = other.orbits;
	}

	Body(String bodyName, Body orbitsAround) {

		// Calls above constructor to set idNum
		this();
		name = bodyName;
		orbits = orbitsAround;
	}

	public String toString() {
		String desc = idNum + " (" + name + ")";
		if (orbits != null) desc += " orbits " + orbits.toString();
		return desc;
	}

	public static void main(String[] args) {

		Body sun = new Body("Sol", null);
		System.out.println(sun.idNum);
		// Handling below in more fluid Constructor definition above
		/*
		 * Body sun = new Body(); sun.idNum = Body.nextID++; sun.name = "Sol";
		 * sun.orbits = null;
		 */
		Body earth = new Body("Earth", sun);
		System.out.println(earth.idNum);
		/*
		 * Body earth = new Body(); earth.idNum = Body.nextID++; earth.name =
		 * "Earth"; earth.orbits = sun;
		 */
		Body moon = new Body("Moon", earth);
		System.out.println(moon.idNum);
		System.out.println(moon.name);
		System.out.println(moon.orbits);
		
		System.out.println("Body " + sun);
		System.out.println("Body " + earth);
	}
}
