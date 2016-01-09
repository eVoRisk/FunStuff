package com.fightcode.HelloWorld;

import java.util.HashMap;

public class NumberOfCharacter {
	public static HashMap<Character, Integer> numberOfCharHash = new HashMap<>();

	public static void numberOfCharacterFromString(String s) {
		for (Character c : s.toCharArray()) {
			if (numberOfCharHash.containsKey(c)) {
				numberOfCharHash.put(c, numberOfCharHash.get(c) + 1);
			} else {
				numberOfCharHash.put(c, 1);
			}
		}
	}

	public static void displayHashMap(HashMap<Character, Integer> hash) {
		for (Character c : hash.keySet()) {
			String key = c.toString();
			String value = hash.get(c).toString();
			System.out.println("Key: " + key + "\tValue: " + value);
		}
	}

	public static void main(String[] args) {
		String s = "asmidiaashmodaiasmodeus";
		numberOfCharacterFromString(s);
		displayHashMap(numberOfCharHash);
	}
}
