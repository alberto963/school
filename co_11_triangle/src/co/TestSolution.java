package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {
	@Test
	void onThreeEqElemsConditionShouldReturn1() {
		int[] a = { 3, 3, 3 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onOneMaxIntConditionShouldReturn1() {
		int[] a = { Integer.MAX_VALUE, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 2 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onThreeMaxIntConditionShouldReturn1() {
		int[] a = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onThreeElemsConditionShouldReturn1() {
		int[] a = { 5, 3, 3 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturn1() {
		int[] a = { 10, 2, 5, 1, 8, 20 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturn0() {
		int[] a = { 10, 2, 5, 1 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}

}
