package co;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String... p) throws Exception {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		// System.out.println(" t=" + t);

		for (int i = 0; i < t; i++) {
			int n0 = Integer.parseInt(input.next());
			int[] a = new int[16];
			for (int j = 0; j < 16; j++) {
				a[j] = Integer.parseInt(input.next());
			}
			int n1 = Integer.parseInt(input.next());
			int[] b = new int[16];
			for (int j = 0; j < 16; j++) {
				b[j] = Integer.parseInt(input.next());
			}
//			System.out.println("t=" + t + " i=" + i + " n0=" + n0 + " a=" + Arrays.toString(a) + " b="
//					+ Arrays.toString(b) + " n1=" + n1);

			String result = solution(n0, a, n1, b);
			int c = i + 1;
			System.out.println("Case #" + c + ": " + result);
		}

		input.close();
	}

	public static String solution(int n0, int[] a, int n1, int[] b) {
		int[] r0 = Arrays.copyOfRange(a, (n0 - 1) * 4, (n0 - 1) * 4 + 4);
		int[] r1 = Arrays.copyOfRange(b, (n1 - 1) * 4, (n1 - 1) * 4 + 4);

		// System.out.println(" n0=" + n0 + " r0=" + Arrays.toString(r0) + " r1=" +
		// Arrays.toString(r1) + " n1=" + n1);

		boolean[] v0 = new boolean[16];
		for (int i = 0; i < 4; i++) {
			v0[r0[i] - 1] = true;
		}

		boolean[] v1 = new boolean[16];
		for (int i = 0; i < 4; i++) {
			v1[r1[i] - 1] = true;
		}
		int r = -1;
		for (int i = 0; i < 16; i++) {
			if (v0[i] && v1[i]) {
				if (r != -1) {
					return "Bad magician!";
				} else {
					r = i + 1;
				}
			}
		}
		if (r != -1) {
			return Integer.toString(r);
		} else {
			return "Volunteer cheated!";
		}
	}
}
