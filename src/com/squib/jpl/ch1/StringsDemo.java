package com.squib.jpl.ch1;

class StringsDemo {

	public static void main(String[] args) {
		String myName = "Adam";
		String myJob = "Consultant";
		myName += " Phillips, ";
		myName += myJob;
		System.out.println("Name: " + myName);
		System.out.println("Character at index 15: " + myName.charAt(15));

		// Creates a new character array assigning each character to an index
		char[] c = new char[] { 'C', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r' };
		// Creates and prints new string from the character array
		String s = new String(c);
		System.out.println(s);

		// Prints the character array value at index 4
		System.out.println(c[4]);

		// Prints the 4th character in the string using the charAt method
		System.out.println(s.charAt(4));

		// Checks if new string is equal to myName
		System.out.println(myName.equals(s));

		// Formats the value of Math.PI using %.3f
		// %n creates the new-line character
		System.out.printf("The formatted value of Math.PI is %.3f %n", Math.PI);

		System.out
				.printf("The formatted value of Math.PI aligned 6 spaces to the right is %11.3f %n",
						Math.PI);

		System.out.println("The unformatted value of Math.PI is " + Math.PI);
	}

}
