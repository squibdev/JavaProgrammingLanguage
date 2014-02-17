package com.squib.jpl.ch1;

class TableofSquares {

	public static void main(String[] args) {

		int start = 1;
		System.out.println(start + " | " + start);

		for (int i = 2; i < 30; i++) {
			int power = i * i;
			if (power % 2 == 0) System.out.println(i + " | " + power);
		}

	}

}
