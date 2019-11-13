package hr_06_2dArray;

public class Solution {

	static int hourglass1Sum(int[][] arr, int[][] hg, int i0, int j0) {
		int s = 0;
		for (int i = i0; i < i0 + 3; i++) {
			for (int j = j0; j < j0 + 3; j++) {
				s = s + arr[i][j] * hg[i - i0][j - j0];
			}
		}
		return s;
	}

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int max = Integer.MIN_VALUE;

		int[][] hg = { { 1, 1, 1 }, { 0, 1, 0 }, { 1, 1, 1 } };
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				int v = hourglass1Sum(arr, hg, i, j);
				if (v > max)
					max = v;
			}
		}
		return max;
	}
}
