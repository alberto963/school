package co;

public class Solution {

	public static int m = 1000001;
	public static boolean[] mem;

	public static int solution(int[] a) {
		// System.out.println("a=" + Arrays.toString(a));

		mem = new boolean[m];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				mem[a[i]] = true;
		}

		// System.out.println("mem=" + Arrays.toString(mem));

		for (int i = 1; i < mem.length; i++) {
			if (!mem[i])
				return i;
		}
		return 0;
	}
}
