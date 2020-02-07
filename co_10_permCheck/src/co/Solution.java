package co;

public class Solution {
	public static int max = 1000000;
	public static boolean[] mem;

	public static int solution(int[] a) {
		mem = new boolean[max + 1];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > a.length)
				return 0;
			mem[a[i]] = true;
		}

		for (int i = 1; i < a.length + 1; i++) {
			if (!mem[i])
				return 0;
		}
		return 1;
	}

}
