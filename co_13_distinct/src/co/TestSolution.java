package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void onConditionShouldReturnValue() {
		int[] a = { 1, 1, 1, 2, 3, 1 };

		int r = 3;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturn1() {
		int[] a = { 1, 1, 1, 1, 1, 1 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturn2() {
		int[] a = { 2, 1, 1, 1, 1, 1 };

		int r = 2;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onAllNegShouldReturn1() {
		int[] a = { -1, -1, -1, -1, -1, -1 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onEmptyShouldReturn0() {
		int[] a = {};

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onOneElemZeroShouldReturn1() {
		int[] a = {0};

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onOneElemShouldReturn1() {
		int[] a = {1};

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onTwoElemShouldReturn2() {
		int[] a = {1, -1};

		int r = 2;
		assertEquals(r, Solution.solution(a));
	}
}
