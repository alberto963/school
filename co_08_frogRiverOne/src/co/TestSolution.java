package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void onExampleShouldReturn6() {

		int[] a = { 1, 3, 1, 4, 2, 3, 5, 4 };

		int x = 5;

		int r = 6;
		assertEquals(r, Solution.solution(x, a));
	}

	@Test
	void onLimit1ShouldReturn1() {

		int[] a = { 1 };

		int x = 1;

		int r = 0;
		assertEquals(r, Solution.solution(x, a));
	}
	
	@Test
	void onLimit1ShouldReturnMinus1() {

		int[] a = { 1, 1 };

		int x = 2;

		int r = -1;
		assertEquals(r, Solution.solution(x, a));
	}
}
