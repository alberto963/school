package co_06_tapeEquilibrium;

public class Solution {

	public static int solution(int[] a) {

		int s = 0;
		for (int i = 0; i < a.length; i++)
			s = s + a[i];

		System.out.println("s=" + s);

		int m = Integer.MAX_VALUE;
		int l = 0;
		for (int p = 0; p < a.length - 1; p++) {
			l = l + a[p];
			System.out.println("l=" + l);

			int r = s - l;
			System.out.println("r=" + r);

			int d = Math.abs(l - r);
			System.out.println("d=" + d);

			if (d < m) {
				System.out.println("p=" + p);
				m = d;
			}
		}

		return m;
	}
}
