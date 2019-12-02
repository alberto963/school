package cj_03_2019_QR_YouCanGoYourOwn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void test1() {
		assertEquals("Case #1: ES", Solution.findPathSlow(1, 2, "SE"));
	}
	
	@Test
	void test2() {
		assertEquals("Case #2: SSEEESES", Solution.findPathSlow(2, 5, "EESSSESE"));
	}
}
