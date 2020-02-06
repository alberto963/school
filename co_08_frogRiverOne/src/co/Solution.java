package co;

import java.util.Arrays;

public class Solution {

	public static int[] mem;

	public static int solution(int x, int[] a) {
		System.out.println("a= " + Arrays.toString(a));

		mem = new int[x + 1];
		for (int i = 0; i < mem.length; i++)
			mem[i] = -1;
		System.out.println("mem= " + Arrays.toString(mem));

		for (int i = 0; i < a.length; i++)
			if (mem[a[i]] == -1 && a[i] < x + 1) {
				mem[a[i]] = i;
				System.out.println("i= " + i + " a[i]= " + a[i] + " mem= " + Arrays.toString(mem));
			}

		System.out.println("x= " + x + " " + Arrays.toString(mem));

		for (int i = 1; i < x + 1; i++)
			if (mem[i] == -1)
				return -1;

		int m = 0;
		for (int i = 1; i < x + 1; i++)
			if (mem[i] > m)
				m = mem[i];

		return m;
	}

}
