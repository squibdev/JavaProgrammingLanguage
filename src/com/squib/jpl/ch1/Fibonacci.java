package com.squib.jpl.ch1;

class Fibonacci {

	/** Print out the Fibonacci sequence for values < 50 */

	static final String TITLE = "Fibonacci Array";
	static final int ARRAY_SIZE = 10;

	public int[] intArray = new int[ARRAY_SIZE];

	public void loadArray(int value, int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = value;
		}

	}

	public int getArraySize() {
		return ARRAY_SIZE;
	}

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();

		int lo = 1, hi = 1;
		int arraySize = fib.getArraySize();

		System.out.println(TITLE);
		System.out.println();
		System.out.println(hi + ":  " + hi);

		for (int i = 0; i < arraySize; i++) {

			fib.loadArray(lo, fib.intArray);
			hi = lo + hi;
			lo = hi - lo;
			if (10 - (i + 2) >= 1) System.out.println((i + 2) + ":  "
					+ fib.intArray[i]);
			else System.out.println((i + 2) + ": " + fib.intArray[i]);
		}

	}
}
