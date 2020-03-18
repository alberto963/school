package co;

import java.util.Scanner;

public class Solution {

	public static void main(String... p) throws Exception {
		Scanner input = new Scanner(System.in);

		int numCases = input.nextInt();
		for (int i = 0; i < numCases; i++) {
			int n = Integer.parseInt(input.next());
			int l = Integer.parseInt(input.next());
			int[] a = new int[l];

			for (int j = 0; j < l; j++) {
				a[j] = Integer.parseInt(input.next());
			}
			String result = solution(i + 1, n, a);
			System.out.println(result);
		}

		input.close();
	}

	public static int maxPrime = 10101;

	public static String solution(int i, int n, int[] a) {

		// System.out.println("a=" + Arrays.toString(a));

		boolean[] primeNumbers = computePrimes(n);

		// System.out.println("primeNumbers=" + Arrays.toString(primeNumbers));

		int[] primes = new int[maxPrime];
		int c0 = 0;
		for (int j = 0; j < n; j++) {
			if (primeNumbers[j]) {
				primes[c0] = j;
				c0++;
			}
		}
		// System.out.println("primes=" + Arrays.toString(primes));

		boolean[] usedPrimes = new boolean[maxPrime];

		int a0 = a[0];
		int first = 0;
		int next = 0;
		int mayAlsoBe = 0;

		for (int j = 2; j < maxPrime; j++) {
			if (primeNumbers[j]) {
				if (a0 % j == 0) {
					next = j;
					mayAlsoBe = a0 / j;

					usedPrimes[next] = true;

					break;
				}
			}
		}
//		System.out.println("next=" + next);
//
//		System.out.println("mayAlsoBe=" + mayAlsoBe);

		for (int j = 1; j < a.length; j++) {
			if (a[j] != a0) {
				if (a[j] % next == 0) {
					next = mayAlsoBe;
					usedPrimes[next] = true;
					first = next;
					break;
				}
			}
		}

		if (first == 0) {
			first = next;
		}

//		System.out.println("next=" + next);

		for (int j = 0; j < a.length; j++) {
			next = a[j] / next;
			usedPrimes[next] = true;
//			System.out.println("j= " + j + " next=" + next);
		}

		int[] keys = new int[26];
		int firstIndex = 0;
		int c = 0;
		for (int j = 0; j < usedPrimes.length; j++) {
			if (usedPrimes[j]) {
				// System.out.println("i=" + i + " j=" + j+ " c=" + c);

				if (j == first) {
					firstIndex = c;
				}
				keys[c] = j;
				c++;
			}
		}

//		System.out.println("keys=" + Arrays.toString(keys));
//		System.out.println("first=" + first + " firstIndex=" + firstIndex);

		String res = "";
		next = a0 / first;
		res = res + (char) (firstIndex + 65);

		// System.out.println("i=" + i + " res=" + res);
		// System.out.println("i=" + i + " next=" + next);

		for (int j = 1; j < a.length; j++) {
			res = res + find(keys, next);
			next = a[j] / next;
		}
		res = res + find(keys, next);

		return "Case #" + i + ": " + res;
	}

	public static char find(int[] keys, int i) {
		for (int j = 0; j < keys.length; j++) {
			if (keys[j] == i) {
				return (char) (j + 65);
			}
		}
		return 0;
	}

	public static boolean[] computePrimes(int n) {
		boolean[] primeNumbers = new boolean[maxPrime];

		for (int i = 1; i <= n; i++) {
			int counter = 0;
			for (int num = i; num > 0; num--) {
				if (i % num == 0) {
					counter = counter + 1;
					// System.out.println("i=" + i + " num=" + num + " counter=" + counter);
				}
				if (counter > 2) {
					break;
				}
			}
			if (i != 1 && counter == 2) {
				primeNumbers[i] = true;
			}
		}
		return primeNumbers;
	}
}
