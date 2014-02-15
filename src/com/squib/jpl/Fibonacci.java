package com.squib.jpl;

class Fibonacci {
	
	/** Print out the Fibonacci sequence for values < 50 */
	
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		
		System.out.println("(" + lo + "," + hi + ")");
		
		while (hi < 1000) {
			
			hi = lo + hi;
			lo = hi - lo;
			System.out.println("(" + lo + "," + hi + ")");
		}
		
	}
}
