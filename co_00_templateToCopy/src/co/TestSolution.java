package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void onConditionShouldReturnValue() {
		int[] a = { 0, 0, 0 };

		int x = 0;
		int y = 0;
		int d = 0;
		int r = 0;
		assertEquals(r, Solution.solution(a, x, y, d));
	}

	@Test
	void onConditionShouldReturnArrayValue() {
		int[] a = { 0, 0, 0 };

		int x = 0;
		int y = 0;
		int d = 0;
		int[] r = { 0, 0, 0 };
		assertArrayEquals(r, Solution.solutionArray(a, x, y, d));
	}
}
