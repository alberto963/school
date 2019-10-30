package hr_01_hiker;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		List<Character> asList = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		List<Integer> l = asList.stream().map(v -> v == 'U' ? 1 : -1).collect(Collectors.toList());

		// System.out.println(l);
		int i, h0 = 0, h = 0, c = 0;
		for (i = 0; i < n; i++) {
			h0 = h;
			h += l.get(i);
			if (h0 == -1 && h == 0) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) throws IOException {
		int result = countingValleys(8, "UDDDUDUU");
		System.out.println(result);
	}
}
