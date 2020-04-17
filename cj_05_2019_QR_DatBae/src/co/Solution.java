package co;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String... p) throws Exception {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(input.next());
			int b = Integer.parseInt(input.next());
			int f = Integer.parseInt(input.next());
			if (i > 0) {
				// System.exit(n);
			}
			// System.out.println("t=" + t + " t=" + t + " n=" + n + " b=" + b + " f=" + f);

			String result = solution(i + 1, n, b, f, input);
			System.out.println(result);
		}

		input.close();
	}

	public static String solution(int i, int n, int b, int f, Scanner input) {

		// System.out.println(String.format("%2s%s", '0', "1"));
		// System.out.println(String.format("%02d%s", 0, "1"));

		String[] returnedFromStore = new String[f];
		String[] toBeSentToStore = testStore(n, f);
		for (int t = 0; t < toBeSentToStore.length; t++) {
			System.out.println(toBeSentToStore[t]);
			String r = input.next();
			if (r.compareTo("-1") == 0) {
				System.exit(-1);
			}
			returnedFromStore[t] = r;
		}

		return processResult(n, f, returnedFromStore);
	}

	public static String localSolution(int i, int n, int b, int f, String[] returnedFromStore) {

		// System.out.println(String.format("%2s%s", '0', "1"));
		// System.out.println(String.format("%02d%s", 0, "1"));

		testStore(n, f);

		return processResult(n, f, returnedFromStore);
	}

	public static String[] testStore(int n, int f) {
		// System.out.println("val=" + val);

		int f0 = Math.min(n, (int) Math.pow(2, f));
		String[] cols = new String[n];
		int p = n / f0;
		int q = n / p;
		// System.out.println("p=" + p);

		for (int b = 0; b < p; b++) {
			for (int c = 0; c < f0; c++) {
				String binaryString = Integer.toBinaryString(c);

				int l = binaryString.length();
				String format = l < f ? "%0" + (f - l) + "d%s" : "%s";
//			System.out.println("format=" + format);
//			System.out.println("binaryString=" + binaryString);

				String val = l < f ? String.format(format, 0, binaryString) : binaryString;
				// System.out.println("val=" + val);

				cols[b * q + c] = val;
			}
		}
		// System.out.println("cols=" + Arrays.toString(cols));

		String[] testStore = new String[f];
		Arrays.fill(testStore, "");

		for (int b = 0; b < p; b++) {
			for (int c = 0; c < f0; c++) {
				for (int r = 0; r < f; r++) {

					int s = f - r - 1;
					// System.out.println("c=" + c + " r=" + r + " s=" + s);

					testStore[r] = testStore[r] + cols[c].substring(s, s + 1);
				}
			}
		}
		// System.out.println("testStore=" + Arrays.toString(testStore));

		return testStore;
	}

	public static String processResult(int n, int f, String[] returnedFromStore) {
		String[] returnedCols = new String[n];
		Arrays.fill(returnedCols, "");

		for (int c = 0; c < f; c++) {
			for (int r = 0; r < returnedFromStore[c].length(); r++) {

				// System.out.println("c=" + c + " r=" + r + " s=" + s);

				returnedCols[r] = returnedCols[r] + returnedFromStore[c].substring(r, r + 1);
			}
		}

		// System.out.println("returnedCols=" + Arrays.toString(returnedCols));

		int[] returnedColsAsInt = new int[returnedFromStore[0].length()];

		for (int c = 0; c < returnedFromStore[0].length(); c++) {
			returnedColsAsInt[c] = Integer.parseUnsignedInt(returnedCols[c], 2);
		}

		// System.out.println("returnedColsAsInt=" +
		// Arrays.toString(returnedColsAsInt));

		boolean[] mem = new boolean[n];
		for (int j = 0; j < returnedColsAsInt.length; j++) {
			if (returnedColsAsInt[j] >= 0) {
				mem[returnedColsAsInt[j]] = true;
			}
		}

		String result = "";
		for (int j = 0; j < n; j++) {
			if (!mem[j]) {
				result = result + j + " ";
			}
		}

		result = result.substring(0, result.length() - 1);

		return result;
	}
}
