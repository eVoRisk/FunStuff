package com.fightcode.HelloWorld;

import java.util.HashMap;

class Hash extends HashMap<String, Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static Integer numberOfPuts = 0;
	public static Integer numberOfGets = 0;

	@Override
	public Integer get(Object key) {
		numberOfGets++;
		return super.get(key);
	}

	@Override
	public Integer put(String key, Integer value) {
		numberOfPuts++;
		return super.put(key, value);
	}
}

public class NumberOfPutsAndGets {
	public static Hash hash = new Hash();

	public static void main(String[] args) {
		hash.put("a", 1);
		hash.put("b", 2);
		hash.put("c", 3);

		hash.get("a");
		hash.get("b");

		System.out.println("Number of Puts: " + Hash.numberOfPuts + " Number of Gets: " + Hash.numberOfGets);
	}
}