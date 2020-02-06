package co_05_permMissingElem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void shouldReturn4() {
		int[] a = new int[4];
		a[0] = 2;
		a[1] = 3;
		a[2] = 1;
		a[3] = 5;
		int r = 4;
		assertEquals(r, Solution.solution(a));
	}

	@Test
	void shouldReturnAgain1() {
		int[] a = new int[0];
		int r = 1;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void shouldReturn1() {
		int[] a = new int[1];
		a[0] = 2;
		int r = 1;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void shouldReturn2() {
		int[] a = new int[1];
		a[0] = 1;
		int r = 2;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void shouldReturn2_1() {
		int[] a = new int[4];
		a[0] = 2;
		a[1] = 3;
		a[2] = 5;
		a[3] = 4;
		int r = 1;
		assertEquals(r, Solution.solution(a));
	}
	@Test
	void shouldReturn6() {
		int[] a = new int[5];
		a[0] = 2;
		a[1] = 3;
		a[2] = 5;
		a[3] = 1;
		a[4] = 4;
		int r = 6;
		assertEquals(r, Solution.solution(a));
	}

}
