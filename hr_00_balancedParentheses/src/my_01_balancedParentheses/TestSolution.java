package my_01_balancedParentheses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void shouldReturn1() {
		assertEquals("YES", Solution.checkParentheses("{[()]}"));
	}
	
	@Test
	void shouldReturn2() {
		assertEquals("NO", Solution.checkParentheses("{[(])}"));
	}
}
