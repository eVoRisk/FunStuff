package com.fightcode.HelloWorld;

import java.util.HashMap;

public class FirstNonRepeatCharacter {

	//////////////////////////////////////////////////////////
	/*
	 * If we found a duplicate key in HashMap collection, we have to increment
	 * the value and first key with the value 1 is the first non repeat
	 * character
	 */
	//////////////////////////////////////////////////////////

	public static HashMap<Character, Integer> nonRepeatHash = new HashMap<>();

	public static Character firstNonRepeatCharacter(String s) {
		Character c;

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (nonRepeatHash.containsKey(c)) {
				nonRepeatHash.put(c, nonRepeatHash.get(c) + 1);
			} else {
				nonRepeatHash.put(c, 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (nonRepeatHash.get(c) == 1) {
				return c;
			}
		}
		return null;
	}

	//////////////////////////////////////////////////////////
	/*
	 * We can transform the String parameter into a char array
	 * and simple check if the current index of a character is also
	 * the last index
	 */
	//////////////////////////////////////////////////////////

	public static void smarterSolution(String s) {
		for(char c: s.toCharArray()) {
			if(s.indexOf(c) == s.lastIndexOf(c)) {
				System.out.println("First non repeat character: " + c);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		String s = "asmidiaashmodaiasmodeus";
		System.out.println("First non repeat character: " + firstNonRepeatCharacter(s));
		smarterSolution(s);
	}
}
