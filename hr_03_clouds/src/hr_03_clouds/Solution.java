package hr_03_clouds;

import java.io.*;

public class Solution {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int p = 0, n = 0;
		while (p < c.length - 3) {
			p = jump(p, c);
			n++;
		}
		return n + 1;
	}

	static int jump(int p, int[] c) {
		return p + 2 - c[p + 2];
	}

	public static void main(String[] args) throws IOException {

		int[] c = { 0, 0, 1, 0, 0, 1, 0 };
		int result = jumpingOnClouds(c);

		System.out.println(result);
	}
}
