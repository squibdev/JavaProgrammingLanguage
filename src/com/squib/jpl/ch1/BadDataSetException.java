package com.squib.jpl.ch1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class BadDataSetException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String fileName = "test";

	public String getFileName() {
		return fileName;
	}
	
}

class MyUtilities {
	public String getDataSet(String setName) throws BadDataSetException {
		String file = setName + ".txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			return readDataSet(in);
		} catch (IOException e) {
			throw new BadDataSetException();
		} finally {
			try {
				if (in != null) in.close();
			} catch (IOException e) {
				;
			}
		}
	}

	public String readDataSet(FileInputStream in) {
		Scanner sc = new Scanner(in);
		while (sc.hasNextLine()) return sc.nextLine();
		sc.close();
		return null;
	}
	
}
