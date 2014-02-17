package com.squib.jpl.ch1;

class Fibonacci2 {

	static final int MAX = 50;
	
	/** Prints the Fibonacci sequence for values < MAX */
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		System.out.println(lo);
		while (hi < MAX) {
			System.out.println(hi);
			hi = lo + hi;
			lo = hi - lo;
		}
	}
	
}
