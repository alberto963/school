package co_03_cyclicRotation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void shouldReturnS0() {
		int[] a = { 3, 8, 9, 7, 6 };
		int[] r = { 9, 7, 6, 3, 8 };
		int k = 3;
		assertArrayEquals(r, Solution.solution(a, k));
	}

	@Test
	void shouldReturnS1() {
		int[] a = { 0, 0, 0 };
		int[] r = { 0, 0, 0 };
		int k = 1;
		assertArrayEquals(r, Solution.solution(a, k));
	}

	@Test
	void shouldReturnS2() {
		int[] a = { 1, 2, 3, 4 };
		int[] r = { 1, 2, 3, 4 };
		int k = 4;
		assertArrayEquals(r, Solution.solution(a, k));
	}

	@Test
	void shouldReturnS3() {
		int[] a = { 0, 1, 2 };
		int[] r = { 2, 0, 1 };
		int k = 1;
		assertArrayEquals(r, Solution.solution(a, k));
	}

	@Test
	void shouldReturnS4() {
		int[] a = {};
		int[] r = {};
		int k = 1;
		assertArrayEquals(r, Solution.solution(a, k));
	}
	
	@Test
	void shouldReturnS5() {
		int[] a = {};
		int[] r = {};
		int k = 0;
		assertArrayEquals(r, Solution.solution(a, k));
	}
	
	@Test
	void shouldReturnS6() {
		int[] a = { 0, 1, 2 };
		int[] r = { 0, 1, 2 };
		int k = 0;
		assertArrayEquals(r, Solution.solution(a, k));
	}
	
	@Test
	void shouldReturnS7() {
		int[] a = { 0, 1, 2 };
		int[] r = { 2, 0, 1 };
		int k = 4;
		assertArrayEquals(r, Solution.solution(a, k));
	}
	
	@Test
	void shouldReturnS8() {
		int[] a = { 0 };
		int[] r = { 0 };
		int k = 4;
		assertArrayEquals(r, Solution.solution(a, k));
	}
	
	@Test
	void shouldReturnS9() {
		int[] a = { 0 };
		int[] r = { 0 };
		int k = 0;
		assertArrayEquals(r, Solution.solution(a, k));
	}
}
