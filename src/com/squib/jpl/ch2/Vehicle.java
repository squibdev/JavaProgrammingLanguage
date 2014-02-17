package com.squib.jpl.ch2;

class Vehicle {

	private double speed;
	private int currentDirection;
	private String brandName;

	private static String staticName = "I'm a static name";

	private final int vehicleID = -1;
	private static int nextVehicleID = 0;

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

	public static void main(String[] args) {

		Vehicle a = new Vehicle();
		Vehicle b = new Vehicle();

		a.setSpeed(10.25);
		a.setCurrentDirection(-1);
		a.setBrandName("Cheverolet Cavalier");

		b.setSpeed(20.75);
		b.setCurrentDirection(1);
		b.setBrandName("Saturn Ion");

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

	}

}
