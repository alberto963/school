package co_07_frogJmp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void shouldReturn3() {
		int x = 10;
		int y = 85;
		int d = 30;
		assertEquals(3, Solution.solution(x, y, d));
	}

	@Test
	void shouldReturn0() {
		int x = 1;
		int y = 1;
		int d = 1;
		assertEquals(0, Solution.solution(x, y, d));
	}
	
	@Test
	void shouldReturn1() {
		int x = 1;
		int y = 2;
		int d = 1;
		assertEquals(1, Solution.solution(x, y, d));
	}
	
	@Test
	void ondGreaterThanyshouldReturn0() {
		int x = 1;
		int y = 1;
		int d = 2;
		assertEquals(0, Solution.solution(x, y, d));
	}
	
	@Test
	void ondGreaterThanyshouldReturn1() {
		int x = 1;
		int y = 2;
		int d = 3;
		assertEquals(1, Solution.solution(x, y, d));
	}
	
	@Test
	void ondHighyshouldReturnMAX_VALUE1() {
		int x = 1;
		int y = Integer.MAX_VALUE;
		int d = 1;
		assertEquals(Integer.MAX_VALUE - 1, Solution.solution(x, y, d));
	}
}
