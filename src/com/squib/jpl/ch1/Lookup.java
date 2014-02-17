package com.squib.jpl.ch1;

interface Lookup {
	/**
	 * Return the value associated with the name, or null if there is no such
	 * value
	 */
	Object find(String name);
	Object add(String name);
	Object remove(String name);
}
