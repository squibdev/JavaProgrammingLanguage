package com.squib.jpl.ch1;

import java.awt.Color;

class Pixel extends Point {
	Color color;

	// Overrides behavior of Superclass and sets color
	// Calls Point's clear method and then also sets color to null for Pixels
	
	@Override
	public void clear() {
		super.clear();
		color = null;
	}
}
 