package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void allNegShouldReturnMinus1() {
		int[] a = { -1, -1, -1 };

		int r = -1;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void allNegLongerShouldReturnMinus1() {
		int[] a = { -1, -1, -1, -2, -1, -1};

		int r = -1;
		assertEquals(r, Solution.solution(a));
	}
	@Test
	void onConditionShouldReturn1000() {
		int[] a = { 10, 10, 10 };

		int r = 1000;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onConditionShouldReturn125() {
		int[] a = { -5, 5, -5, 4 };

		int r = 125;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onConditionShouldReturn60() {
		int[] a = { -3, 1, 2, -2, 5, 6 };

		int r = 60;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onTwoNegsShouldReturn125() {
		int[] a = { -4, -6, 3, 4, 5 };

		int r = 125;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onNegHighShouldReturn1800() {
		int[] a = { -30, -10, 2, -2, 5, 6 };

		int r = 1800;
		assertEquals(r, Solution.solution(a));
	}


	@Test
	void onThreeItemsShouldReturn0() {
		int[] a = { 0, 0, 0 };

		int r = 0;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onThreeItemsShouldReturnMinus1000000() {
		int[] a = { -1000, 1, 1000 };

		int r = -1000000;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void onThreeItemsShouldReturnMinus1() {
		int[] a = { 1, 1, 1 };

		int r = 1;
		assertEquals(r, Solution.solution(a));
	}
}
