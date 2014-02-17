package com.squib.jpl.ch1;

@Reviewed(reviewer = "Adam Phillips", date = 20140216)
class ImprovedFibonacci {

	static final int MAX_INDEX = 20;

	/**
	 * Prints out the first few Fibonacci numbers, marking events with a '*'
	 */
	public static void main(String[] args) {

		int lo = 1;
		int hi = 1;

		int[] array = new int[MAX_INDEX];

		String[] strArray = new String[MAX_INDEX];
		strArray[0] = "1: ";

		System.out.println("1:  " + hi);

		for (int i = 2; i < MAX_INDEX; i++) {

			StoreFibonacci str = new StoreFibonacci(i, array, hi);

			hi = lo + hi;
			lo = hi - lo;
			
			if (i < 10) System.out.printf("%d:  %d", i,array[i]);
			else System.out.printf("%d: %d", i,array[i]);

			if (lo % 2 == 0) System.out.printf(" " + str.isEven() + "%n");
			else System.out.printf(str.isOdd() + "%n");
		}

	}

}
