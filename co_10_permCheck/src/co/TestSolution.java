package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void onConditionShouldReturn1() {
		int[] a = new int[4];
		a[0] = 4;
		a[1] = 1;
		a[2] = 3;
		a[3] = 2;

		int r = 1;

		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onConditionShouldReturn0() {
		int[] a = new int[3];
		a[0] = 4;
		a[1] = 1;
		a[2] = 3;

		int r = 0;

		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onOneElemShouldReturn0() {
		int[] a = new int[1];
		a[0] = 4;

		int r = 0;

		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onOneElemShouldReturn1() {
		int[] a = new int[1];
		a[0] = 1;

		int r = 1;

		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onTwoElemShouldReturn0() {
		int[] a = new int[2];
		a[0] = 4;
		a[1] = 1;

		int r = 0;

		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onTwoElemRightSeqShouldReturn0() {
		int[] a = new int[2];
		a[0] = 1;
		a[1] = 4;

		int r = 0;

		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onTwoElemShouldReturn1() {
		int[] a = new int[2];
		a[0] = 1;
		a[1] = 2;

		int r = 1;

		assertEquals(r, Solution.solution(a));
	}

	@Test
	void onPermPlustwiceElemShouldReturn0() {
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[1] = 2;

		int r = 0;

		assertEquals(r, Solution.solution(a));
	}
}
