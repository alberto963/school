package hr_01_hiker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void shouldReturn1() {
		assertEquals(1, Solution.countingValleys(8, "UDDDUDUU"));
	}
	
	@Test
	void shouldReturn2() {
		assertEquals(2, Solution.countingValleys(25, "UDDUUUDDDDDUDUDUUUDDDDUDUU"));
	}
}
