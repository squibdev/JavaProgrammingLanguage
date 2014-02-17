package com.squib.jpl.ch1;

import java.text.DecimalFormat;

class Point {
	
	static final String TITLE = "Point Coordinates:";
	public double x, y;
	
	public double distance(Point that) {
		double xdiff = x - that.x;
		double ydiff = y - that.y;
		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
	}

	public void clear() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setToPoint(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.0"); 
		
		Point lowerLeft = new Point();
		Point upperRight = new Point();
		Point middlePoint = new Point();
		
		Point newUpperRight = new Point();
		
		lowerLeft.x = 0.0;
		lowerLeft.y = 0.0;
		
		upperRight.x = 1280.0;
		upperRight.y = 1024.0;
		
		middlePoint.x = upperRight.x / 2;
		middlePoint.y = upperRight.y / 2;
		
		newUpperRight.x = 1920.0;
		newUpperRight.y = 1080.0;
		
		System.out.println(TITLE);
		System.out.println();
		System.out.println("Lower left:   (" + lowerLeft.x + "," + lowerLeft.y + ")");
		System.out.println("Upper right:  (" + upperRight.x + "," + upperRight.y + ")");
		System.out.println("Middle point: (" + middlePoint.x + "," + middlePoint.y + ")");
		System.out.println();
		
		System.out.println("Distance between Lower left and Upper right points: " + 
				df.format(lowerLeft.distance(upperRight)));
		System.out.println("Distance between Lower left and Middle points: " + 
				df.format(lowerLeft.distance(middlePoint)));
		System.out.println();
		
		System.out.println("Moving Upper Right to (1920, 1080):");
		System.out.println();
		
		upperRight.setToPoint(newUpperRight);
		middlePoint.setToPoint(newUpperRight);
		middlePoint.x /= 2;
		middlePoint.y /= 2;
		
		System.out.println("New upper right:   (" + upperRight.x + "," + upperRight.y + ")");
		System.out.println("New middle point:  (" + middlePoint.x + "," + middlePoint.y + ")");
	}
	
}
