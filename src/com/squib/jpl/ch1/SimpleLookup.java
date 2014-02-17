package com.squib.jpl.ch1;

class SimpleLookup implements Lookup {
	
	private String[] names;
	private Object[] values;
	
	@Override
	public Object find(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) return values[i];
		}
		return null;
	}
	
	@Override
	public Object add(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(null)) values[i] = name;
		}
		return null;
	}

	@Override
	public Object remove(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) values[i] = null;
		}
		return null;
	}
}
