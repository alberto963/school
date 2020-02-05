package co_03_cyclicRotation;

public class Solution {

	public static int[] solution0_wrong(int[] a, int k) {
		if (k == 0)
			return a;

		int[] r = new int[a.length];

		for (int i = a.length - k; i < a.length; i++)
			r[i - a.length + k] = a[i];

		for (int i = 0; i < a.length - k; i++)
			r[i + k] = a[i];

		return r;
	}
	
	public static int[] solution(int[] a, int k) {
		if (k == 0 || a.length == 0)
			return a;

		k = k % a.length;
		int[] r = new int[a.length];

		for (int i = a.length - k; i < a.length; i++)
			r[i - a.length + k] = a[i];

		for (int i = 0; i < a.length - k; i++)
			r[i + k] = a[i];

		return r;
	}
}
