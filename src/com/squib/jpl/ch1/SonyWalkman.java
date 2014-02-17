package com.squib.jpl.ch1;

class SonyWalkman {

	private double speed = 1.0;
	private boolean playing = false;
	protected Object jack1 = new Object();
	
	public SonyWalkman(double speed, boolean playing, Object jack1) {
		this.speed = speed;
		this.playing = playing;
		this.jack1 = jack1;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public boolean getState() {
		return playing;
	}
	
	public void getJacks() {
		Object[] jacks = new Object[1];
		jacks[0] = jack1;
	}
	
	public boolean play() {
		playing = true;
		return playing;
	}
	
	public boolean stop() {
		playing = false;
		return playing;
	}
	
	public void FastForward() {
		playing = false;
		speed = 2.0;
	}
	
	public void rewind() {
		playing = false;
		speed = -2.0;
	}
	
}
