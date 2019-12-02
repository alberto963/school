package cj_03_2019_QR_YouCanGoYourOwn;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String... p) throws Exception {
		Scanner input = new Scanner(System.in);

		int numCases = input.nextInt();
		for (int i = 0; i < numCases; i++) {
			int d = Integer.parseInt(input.next());
			String pt = input.next();

			String result = findPathSlow(i + 1, d, pt);
			System.out.println(result);
		}

		input.close();
	}

	public static String findPathSlowAlso(int i, int d, String pt) {
		String a = "";
		for (int j = 0; j < 2 * d - 2; j++) {
			a = a + (pt.charAt(j) == 'S' ? "E" : "S");
		}
		return "Case #" + i + ": " + a;
	}

	/*
	 * Slow because it did not pass sample test set 3 with: 
	 * For at most 10 cases, 2 <= d <= 50000.
	 * For all other cases, 2 <= d <= 10000.
	 * It reached TLE (15 secs) on https://codingcompetitions.withgoogle.com/codejam with test set 3
	 */
	public static String findPathSlow(int i, int d, String pt) {
		List<String> asList = Arrays.asList(pt.split(""));
		String a = asList.stream().reduce("", (ac, c) -> c.compareTo("S") == 0 ? ac + "E" : ac + "S");
		return "Case #" + i + ": " + a;
	}
}
