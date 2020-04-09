package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void onGivenTestShouldReturnValue() {
		int a = 123456;
		int r = 162534;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturn103() {
		int a = 130;
		int r = 103;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onlimit0TestShouldReturn0() {
		int a = 0;
		int r = 0;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onlimit1TestShouldReturn0() {
		int a = 1;
		int r = 1;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onlimitmaxTestShouldReturn1() {
		int a = 100000000;
		int r = 100000000;
		assertEquals(r, Solution.solution(a));
	}
}
