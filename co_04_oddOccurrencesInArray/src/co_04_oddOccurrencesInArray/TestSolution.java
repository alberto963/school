package co_04_oddOccurrencesInArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void shouldReturn7() {
		int[] a = new int[7];
		a[0] = 9;
		a[1] = 3;
		a[2] = 9;
		a[3] = 3;
		a[4] = 9;
		a[5] = 7;
		a[6] = 9;
		int r = 7;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void shouldReturn9() {
		int[] a = new int[1];
		a[0] = 9;
		int r = 9;
		assertEquals(r, Solution.solution(a));
	}
	
	@Test
	void shouldReturn5() {
		int[] a = new int[7];
		a[0] = 9;
		a[1] = 3;
		a[2] = 9;
		a[3] = 3;
		a[4] = 9;
		a[5] = 9;
		a[6] = 5;
		int r = 5;
		assertEquals(r, Solution.solution(a));
	}
}
