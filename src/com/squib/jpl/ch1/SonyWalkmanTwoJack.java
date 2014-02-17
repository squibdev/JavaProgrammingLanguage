package com.squib.jpl.ch1;

class SonyWalkmanTwoJack extends SonyWalkman {

	Object jack2 = new Object();
	
	public SonyWalkmanTwoJack(double speed, boolean playing, Object jack1) {
		super(speed, playing, jack1);
	}
	
	public SonyWalkmanTwoJack(double speed, boolean playing, Object jack1, Object jack2) {
		super(speed, playing, jack1);
		this.jack2 = jack2;
	}
	
	public void getJacks() {
		Object[] jacks = new Object[2];
		jacks[0] = super.jack1;
		jacks[1] = jack2;
	}
	

}
