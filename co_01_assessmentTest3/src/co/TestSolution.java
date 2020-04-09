package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void onConditionShouldReturn504() {
		String s = "00:00:00";
		String t = "23:59:59";

		int r = 504;
		assertEquals(r, Solution.solution(s, t));
	}

	@Test
	void onConditionShouldReturn1() {
		String s = "15:15:00";
		String t = "15:15:12";

		int r = 1;
		assertEquals(r, Solution.solution(s, t));
	}

	@Test
	void onConditionShouldReturn3() {
		String s = "22:22:21";
		String t = "22:22:23";

		int r = 3;
		assertEquals(r, Solution.solution(s, t));
	}

	@Test
	void onSimpleShouldReturn1() {
		String s = "15:15:11";
		String t = "15:15:11";

		int r = 1;
		assertEquals(r, Solution.solution(s, t));
	}
	
	@Test
	void onSimpleShouldReturn0() {
		String s = "15:15:22";
		String t = "15:15:23";

		int r = 0;
		assertEquals(r, Solution.solution(s, t));
	}
}
