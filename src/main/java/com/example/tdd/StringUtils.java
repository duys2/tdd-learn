package com.example.tdd;

public class StringUtils {
	public static String reverse(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

	// Palindrome: 뒤집어도 같은 단어 e.g. 기러기, 토마토 등
	public static boolean isPalindrome(String str) {
		if (str == null || str.isEmpty()) {
			return true;
		}
		String cleaned = str.replaceAll("\\\\s+", "").toLowerCase();
		return cleaned.equals(reverse(cleaned));
	}
}