package com.squib.jpl.ch1;

class SonyWalkmanTwoWay extends SonyWalkmanTwoJack {

	Object mic1 = new Object();
	Object mic2 = new Object();
	
	public SonyWalkmanTwoWay(double speed, boolean playing, Object jack1,
			Object jack2) {
		super(speed, playing, jack1, jack2);
	}
	
	public SonyWalkmanTwoWay(double speed, boolean playing, Object jack1,
			Object jack2, Object mic1, Object mic2) {
		super(speed, playing, jack1, jack2);
		this.mic1 = mic1;
		this.mic2 = mic2;
	}
	
	

}
