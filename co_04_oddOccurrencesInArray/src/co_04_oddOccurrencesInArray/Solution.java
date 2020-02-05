package co_04_oddOccurrencesInArray;

public class Solution {

	public static int max = 1000000000;

	public static boolean[] mem0 = new boolean[max];
	public static boolean[] mem1 = new boolean[max];

	public static int solutionWrong(int[] a) {
		if (a.length == 1)
			return a[0];

		for (int i = 0; i < a.length; i++)
			if (mem0[a[i]]) {
				mem1[a[i]] = true;
			} else {
				mem0[a[i]] = true;
			}

		for (int i = 0; i < max; i++)
			if (mem0[i] && !mem1[i])
				return i;

		return -1;
	}

	public static int max1 = 1000000000;

	public static int llong = 64;
	public static int num = max1 / llong + max1 % llong;
	public static long[] mem = new long[num];

	public static int solutionInterrupted(int[] a) {
		for (int i = 0; i < a.length; i++) {
			long x0 = 2 ^ a[i];
			long x = x0 / num;
			System.out.println(x0);
			System.out.println(x);
		}

		return -1;
	}

	public static int max0 = 1000001;

	// O(n^2)
	public static int solution(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != max0) {
				boolean found = false;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						a[j] = max0;
						found = true;
						break;
					}
				}
				if (!found) {
					return a[i];
				}
			}
		}

		return a[a.length - 1];
	}
}
