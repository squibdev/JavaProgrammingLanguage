package com.squib.jpl.ch2;

class Primes {

	static int[] knownPrimes = new int[4];
	
	static {

		knownPrimes[0] = 2;

		for (int i = 1; i < knownPrimes.length; i++) {
			knownPrimes[i] = (int) nextPrime();
		}
	}

	static Object nextPrime() {
		return 0;
	}

	public static void main(String[] args) {

		for (int i = 0; i < knownPrimes.length; i++) {
			System.out.println(knownPrimes[i]);
		}
	}
}
