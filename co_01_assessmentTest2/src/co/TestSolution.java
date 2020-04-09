package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void onConditionShouldReturn3() {
		int[] a = { 3, 2, -2, 5, -3 };

		int r = 3;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturn1() {
		int[] a = { 1, 1, 2, -1, 2, -1 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturnValue() {
		int[] a = { 1, 2, 3, -4 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onOneElemShouldReturn0() {
		int[] a = { 1 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onOneElem0ShouldReturn0() {
		int[] a = { 0 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onTwoElemShouldReturn0() {
		int[] a = { 1, 2 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onTwoElemPlusMinusShouldReturn0() {
		int[] a = { 1, -2 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onTwoElem0ShouldReturn0() {
		int[] a = { 0, 0 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onTwoElemShouldReturn1() {
		int[] a = { 1, -1 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onTwoRepeatedPosiveElemShouldReturn0() {
		int[] a = { 1, 1 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onTwoRepeatedElemShouldReturn0() {
		int[] a = { -1, -1 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onThreeRepeatedElemShouldReturn1() {
		int[] a = { -1, -1, 1 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}
}
