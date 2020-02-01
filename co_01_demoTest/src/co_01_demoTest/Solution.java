package co_01_demoTest;

public class Solution {

	public static int solutionGreedy(int[] a) {

		for (int i = 1; i < a.length + 1; i++) {
			boolean found = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					found = true;
					break;
				}
			}

			if (!found) {
				return i;
			}
		}
		return a.length + 1;
	}

	public static int max = 1000001;
	public static boolean[] mem = new boolean[max];

	public static int solution(int[] a) {

		for (int i = 0; i < a.length; i++)
			if (a[i] > 0)
				mem[a[i]] = true;

		int i = 1;
		while (mem[i])
			i++;

		return i;
	}
}
