package hr_04_repeatedString;

import java.util.stream.Collectors;

public class Solution {

	static long repeatedString(String s, long n) {

		long p = n / s.length();
		long n0 = getNumOfA(s) * p;

		long r = n % s.length();
		long n1 = getNumOfA(s.substring(0, (int) r));

		return n0 + n1;
	}

	private static int getNumOfA(String s) {
		return s.chars().mapToObj(c -> c == 'a').filter(c -> c).collect(Collectors.toList()).size();
	}

	public static void main(String[] args) {
		long result = repeatedString("aba", 10L);
		System.out.println(result);
	}
}
