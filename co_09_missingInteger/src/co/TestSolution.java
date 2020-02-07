package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void onConditionShouldReturn5() {
		int[] a = { 1, 3, 6, 4, 1, 2 };

		int r = 5;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturn3() {
		int[] a = { 1, 2, 3 };

		int r = 4;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturn1() {
		int[] a = { -1, -3 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}
}
