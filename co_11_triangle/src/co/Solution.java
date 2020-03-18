package co;

public class Solution {

	public static int solution(int[] a) {
		// System.out.println(a.length);

		if (a.length < 3)
			return 0;

		for (int p = 0; p < a.length - 2; p++) {
			// System.out.println(p);

			for (int q = p + 1; q < a.length - 1; q++) {
				// System.out.println(p + " " + q );

				for (int r = q + 1; r < a.length; r++) {
					// System.out.println(p + " " + q + " " + r);
					if (ck(a[p], a[q], a[r]))
						return 1;
				}
			}
		}
		return 0;
	}

	public static boolean ck(long ap, long aq, long ar) {
		return ap + aq > ar && aq + ar > ap && ar + ap > aq;
	}

}
