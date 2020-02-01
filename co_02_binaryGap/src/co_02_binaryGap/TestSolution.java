package co_02_binaryGap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void shouldReturn0() {
		int n = 16;
		assertEquals(0, Solution.solution(n));
	}

	@Test
	void shouldReturn5() {
		int n = 1041;
		assertEquals(5, Solution.solution(n));
	}
	
	@Test
	void shouldReturn3() {
		int n = 561892;
		assertEquals(3, Solution.solution(n));
	}
	
}
