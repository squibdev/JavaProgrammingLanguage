package com.squib.jpl.ch2;

class BlockBody {

	public long idNum;
	public String name = "<unnamed>";
	public Body orbits = null;

	private static long nextID = 0;

	// Sets an initialization block, which takes place prior to any constructors
	{
		idNum = nextID;
	}
	
	public BlockBody(String bodyName, Body orbitsAround) {
		name = bodyName;
		orbits = orbitsAround;
	}
}
