package cj_02_2019_QR_ForegoneSolution;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

	static Pattern p = Pattern.compile("^0*");

	public static void main(String... p) throws Exception {
		Scanner input = new Scanner(System.in);

		int numCases = input.nextInt();
		for (int i = 0; i < numCases; i++) {
			String n = input.next();

			String result = findAddendWithNo4(i + 1, n);
			System.out.println(result);
		}

		input.close();
	}

	public static String findAddendWithNo4(int i, String n) {
		List<String> asList = Arrays.asList(n.split(""));
		String a = asList.stream().reduce("", (ac, c) -> c.compareTo("4") == 0 ? ac + "3" : ac + c);
		String b = asList.stream().reduce("", (bc, c) -> c.compareTo("4") == 0 ? bc + "1" : bc + "0");

		return String.format("Case #%d: %s %s", i, a, trim(b));
	}

	static String trim(String s) {
		String[] split = p.split(s);
		
		return split[split.length - 1];
	}
}
