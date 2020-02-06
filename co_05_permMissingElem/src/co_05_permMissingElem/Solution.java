package co_05_permMissingElem;

public class Solution {
	public static int max = 10;
	public static boolean[] mem;

	public static int solution1Wrong(int[] a) {
		if (a.length == 0)
			return 1;

		for (int i = 0; i < a.length; i++) {
			mem[a[i]] = true;
		}
		
		//System.out.println(Arrays.toString(mem));

		for (int i = 1; i < a.length + 1; i++) {
			if (!mem[i])
				return i;
		}

		return -1;
	}
	
	public static int solution(int[] a) {
		mem = new boolean[max + 1];
		if (a.length == 0)
			return 1;

		for (int i = 0; i < a.length; i++) {
			mem[a[i]] = true;
		}
		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(mem));

		for (int i = 1; i < a.length + 1; i++) {
			if (!mem[i])
				return i;
		}

		return a.length + 1;
	}
}
