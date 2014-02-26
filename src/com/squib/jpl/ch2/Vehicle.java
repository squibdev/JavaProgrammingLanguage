package com.squib.jpl.ch2;

class Vehicle {

	private double speed;
	private int currentDirection;
	private String brandName;

	private static String staticName = "I'm a static name";

	private int vehicleID = 0;
	private static int nextVehicleID = 1;

	Vehicle() {

		vehicleID = nextVehicleID;
		nextVehicleID++;
	}

	Vehicle(String newBrandName) {
		this();
		brandName = newBrandName;
	}

	public String toString() {
		String desc = vehicleID + " (" + brandName + ") traveling at " + speed
				+ " in direction " + currentDirection + ".";
		return desc;

	}

	public double getSpeed() {

		return speed;
	}

	public int getCurrentDirection() {

		return currentDirection;
	}

	public String getBrandName() {

		return brandName;
	}

	public String getStaticName() {

		return staticName;
	}

	public void setSpeed(double newValue) {

		speed = newValue;
	}

	public void setCurrentDirection(int newValue) {

		currentDirection = newValue;
	}

	public void setBrandName(String newValue) {

		brandName = newValue;
	}

	public void setStaticName(String newValue) {

		staticName = newValue;
	}

	static int getHighestID() {
		return nextVehicleID - 1;
	}

	public static void main(String[] args) {

		Vehicle a = new Vehicle("Cheverolet Cavalier");
		System.out.println("Highest ID: " + Vehicle.getHighestID());
		Vehicle b = new Vehicle("Saturn Ion");
		System.out.println("Highest ID: " + Vehicle.getHighestID());

		System.out.println();

		a.setSpeed(10.25);
		a.setCurrentDirection(-1);

		b.setSpeed(20.75);
		b.setCurrentDirection(1);

		System.out.println("Vehicle A Details:");
		System.out.println("  Speed    : " + a.getSpeed());
		System.out.println("  Direction: " + a.getCurrentDirection());
		System.out.println("  Brand    : " + a.getBrandName());

		System.out.println();

		System.out.println("Vehicle B Details:");
		System.out.println("  Speed    : " + b.getSpeed());
		System.out.println("  Direction: " + b.getCurrentDirection());
		System.out.println("  Brand    : " + b.getBrandName());

		System.out.println();
		System.out.printf("Manipulating Static Fields:%n%n");
		System.out.println("Getting Object A Current Value:");
		System.out.println("  " + a.getStaticName());
		System.out.println("Setting Object B Value and Getting:");
		b.setStaticName("This is a different static value");
		System.out.println("  " + b.getStaticName());
		System.out.println("Re-checking Object A Current Value");
		System.out.println("  " + a.getStaticName());
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.println("Vehicle " + a);
		System.out.println("Vehicle " + b);

	}

}
