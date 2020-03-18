package co;

import java.util.Arrays;

public class Solution {

	public static int solution(int[] a) {
		class Wrap implements Comparable<Wrap> {
			@Override
			public String toString() {
				return "Wrap [neg=" + neg + ", v=" + v + "]";
			}

			boolean neg;
			int v;

			@Override
			public int compareTo(Wrap o) {
				return this.v - o.v;
			}

		}

		boolean allneg = true;
		for (int s = 0; s < a.length; s++) {
			if (a[s] >= 0) {
				allneg = false;
			}
		}

		if (allneg) {
			Arrays.sort(a);
			int r = 1;
			for (int i = a.length - 1; i > a.length - 4; i--)
				r = r * a[i];

			return r;
		}

		Wrap[] w = new Wrap[a.length];

		for (int s = 0; s < a.length; s++) {
			w[s] = new Wrap();
			w[s].neg = a[s] < 0;
			w[s].v = Math.abs(a[s]);
		}

		Arrays.sort(w);

		System.out.println("w=" + Arrays.toString(w));

		int r = 1;
		int m = 1;
		for (int i = w.length - 1; i >= 0; i--) {
			m = m * (w[i].neg ? -1 : 1);
			r = r * w[i].v;
			System.out.println("m=" + m + " r=" + r);

			if (m == -1 && i <= w.length - 3) {
				if (i == 0)
					return m * r;

				System.out.println(i);
				m = 1;
				r = r / w[i].v;

			} else if (i <= w.length - 3) {
				return r;
			}
		}

		return r;
	}

	public static int solution0(int[] a) {

		Arrays.sort(a);

		int r = 1;
		for (int i = a.length - 1; i > a.length - 4; i--)
			r = r * a[i];

		return r;
	}

	public static int solutionInterrupted(int[] a) {

		Arrays.sort(a);

		int s;
		for (s = 0; s < a.length; s++)
			if (a[s] >= 0)
				break;
		System.out.println("s=" + s);

		int[] abneg = new int[s];
		for (int i = 0; i < abneg.length; i++)
			abneg[i] = Math.abs(a[i]);

		int r = 1;
//		if (s != 1) {
//			for (int i = ab.length - 1; i > ab.length - 4; i--)
//				r = r * ab[i];
//		} else {
//			for (int i = a.length - 1; i > a.length - 4; i--)
//				r = r * a[i];
//		}

		return r;
	}

}
