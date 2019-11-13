package hr_06_2dArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void shouldReturn19() {
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 2, 1, 4, 0 } };
		assertEquals(19, Solution.hourglassSum(arr));
	}
	
	@Test
	void shouldReturn13() {
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 9, 2, -4, -4, 0 },
				{ 0, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 } };
		assertEquals(13, Solution.hourglassSum(arr));
	}
}
