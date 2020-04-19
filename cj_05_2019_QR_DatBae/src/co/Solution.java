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

			// System.out.println("t=" + t + " t=" + t + " n=" + n + " b=" + b + " f=" + f);

			String result = solution(n, b, f, input);
			System.out.println(result);
			int r = Integer.parseInt(input.next());

			if (r != 1) {
				System.exit(f);
			}
		}

		input.close();
	}

	public static String solution(int n, int b, int f, Scanner input) {

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

		int cols = f;
		int rows = (int) Math.pow(2, f);
		char[][] m = new char[rows][f];

		for (int r = 0; r < rows; r++) {
			String binaryString = Integer.toBinaryString(r);
			int l = binaryString.length();
			String format = l < f ? "%0" + (f - l) + "d%s" : "%s";
			binaryString = l < f ? String.format(format, 0, binaryString) : binaryString;
			m[r] = binaryString.toCharArray();
		}

		char[][] mr = new char[cols][rows];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				mr[c][r] = m[r][c];
			}
		}

		int attempts = f;
		int blocks = n / rows + 1;
		String[] result = new String[attempts];
		Arrays.fill(result, "");

		for (int a = 0; a < attempts; a++) {
			for (int b = 0; b < blocks; b++) {
				result[a] = result[a] + String.valueOf(mr[a]);
			}
		}

		for (int a = 0; a < attempts; a++) {
			result[a] = result[a].substring(0, n);
		}

		int maxAttempts = f;
		String[] testStore = new String[maxAttempts];
		Arrays.fill(testStore, "");

		for (int a = 0; a < maxAttempts; a++) {
			testStore[a] = result[attempts - a - 1];
		}

		return testStore;
	}

	public static String processResult(int n, int f, String[] returnedFromStore) {
		String[] returnedCols = new String[n];
		Arrays.fill(returnedCols, "");

		// System.out.println("returnedFromStore=" +
		// Arrays.toString(returnedFromStore));

		int length = returnedFromStore[0].length();
		// System.out.println("length=" + length);

		for (int c = 0; c < f; c++) {
			for (int r = 0; r < length; r++) {

				// System.out.println("c=" + c + " r=" + r);

				returnedCols[r] = returnedFromStore[c].substring(r, r + 1) + returnedCols[r];
			}
		}

		// System.out.println("returnedCols=" + Arrays.toString(returnedCols));

		int[] returnedColsAsInt = new int[length];

		for (int c = 0; c < length; c++) {
			returnedColsAsInt[c] = Integer.parseUnsignedInt(returnedCols[c], 2);
		}

		// System.out.println("returnedColsAsInt=" +
		// Arrays.toString(returnedColsAsInt));

		int rows = (int) Math.pow(2, f);

		// System.out.println("n=" + n + " length=" + length);

		int b = 0;
		boolean[] mem = new boolean[n];
		for (int j = 0; j < length; j++) {
			int curr = returnedColsAsInt[j];
			if (j < length - 1) {
				int next = returnedColsAsInt[j + 1];
				mem[b * rows + curr] = true;

				if (curr >= next) {
					b++;
				}
			} else {
				mem[b * rows + curr] = true;
			}
		}

		// System.out.println("mem=" + Arrays.toString(mem));

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
