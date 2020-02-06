package co_06_tapeEquilibrium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void shouldReturn1() {
		int[] a = { 3, 1, 2, 4, 3 };
		assertEquals(1, Solution.solution(a));
	}

	@Test
	void withTwoElemsShouldReturn2() {
		int[] a = { 3, 1 };
		assertEquals(2, Solution.solution(a));
	}

	@Test
	void withSameValuesshouldReturn0() {
		int[] a = { 1, 1 };
		assertEquals(0, Solution.solution(a));
	}

	@Test
	void withSameZeroValuesshouldReturn0() {
		int[] a = { 0, 0 };
		assertEquals(0, Solution.solution(a));
	}
	@Test
	void withSameZeroThreValuesshouldReturn0() {
		int[] a = { 0, 0, 0 };
		assertEquals(0, Solution.solution(a));
	}
}
