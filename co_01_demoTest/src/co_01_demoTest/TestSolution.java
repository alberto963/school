package co_01_demoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void shouldReturn5() {
		int[] arr = { 1, 3, 6, 4, 1, 2 };
		assertEquals(5, Solution.solution(arr));
	}

	@Test
	void shouldReturn4() {
		int[] arr = { 1, 2, 3 };
		assertEquals(4, Solution.solution(arr));
	}

	@Test
	void shouldReturn1() {
		int[] arr = { -1 };
		assertEquals(1, Solution.solution(arr));
	}
	
	@Test
	void shoulAlsodReturn1() {
		int[] arr = { -1, 0 };
		assertEquals(1, Solution.solution(arr));
	}
	
	@Test
	void shoulAlso2dReturn1() {
		int[] arr = { -1000000, 1000000 };
		assertEquals(1, Solution.solution(arr));
	}
	
	@Test
	void shouldReturn2() {
		int[] arr = { 1 };
		assertEquals(2, Solution.solution(arr));
	}
}
