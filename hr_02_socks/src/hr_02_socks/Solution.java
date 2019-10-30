package hr_02_socks;

import java.io.*;
import java.util.*;

public class Solution {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> sm = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			Integer v = sm.putIfAbsent(ar[i], 1);
			if (v != null) {
				sm.put(ar[i], v + 1);
			}
		}
		// System.out.println(sm);
		int l = sm.values().stream().reduce(0, (a, p) -> a + p / 2);

		return l;
	}

	public static void main(String[] args) throws IOException {
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int result = sockMerchant(9, ar);
		System.out.println(result);
	}
}
