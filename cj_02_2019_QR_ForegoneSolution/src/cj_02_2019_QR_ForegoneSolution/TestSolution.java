package cj_02_2019_QR_ForegoneSolution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void test4() {
		assertEquals("Case #1: 3 1", Solution.findAddendWithNo4(1, "4"));
	}

	@Test
	void test44() {
		assertEquals("Case #2: 33 11", Solution.findAddendWithNo4(2, "44"));
	}
	
	@Test
	void test434() {
		assertEquals("Case #3: 333 101", Solution.findAddendWithNo4(3, "434"));
	}
	
	@Test
	void test123454321() {
		assertEquals("Case #4: 123353321 101000", Solution.findAddendWithNo4(4, "123454321"));
	}
}
