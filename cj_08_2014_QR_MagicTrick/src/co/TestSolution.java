package co;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void testCase0() {
		int n0 = 2;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		int n1 = 3;
		int[] b = { 1, 2, 5, 4, 3, 11, 6, 15, 9, 10, 7, 12, 13, 14, 8, 16 };

		String testR = Solution.solution(n0, a, n1, b);

		String r = "7";

		assertEquals(r, testR);
	}
	
	@Test
    void testCase1() {
		int n0 = 2;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		int n1 = 2;
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		String testR = Solution.solution(n0, a, n1, b);

		String r = "Bad magician!";

		assertEquals(r, testR);
	}
	
	@Test
    void testCase2() {
		int n0 = 2;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		int n1 = 3;
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		String testR = Solution.solution(n0, a, n1, b);

		String r = "Volunteer cheated!";

		assertEquals(r, testR);
	}
}
