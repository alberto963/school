package co;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestLocalSolution {

	@Test
	void onNis4AndandBis3Fis10TestStoreShouldReturnValue() {
		// b is not needed in this implementation because 2^f=n (2^2=8)
		@SuppressWarnings("unused")
		int n = 4, b = 3, f = 10;

		String[] testStore = Solution.testStore(n, f);
		// System.out.println("testStore=" + Arrays.toString(testStore));

		String[] r = { "0101", "0011", "0000", "0000", "0000", "0000", "0000", "0000", "0000", "0000" };
		assertArrayEquals(r, testStore);
	}

	@Test
	void onNis8AndFis3TestStoreShouldReturnValue() {
		// b is not needed
		@SuppressWarnings("unused")
		int n = 8, b = 2, f = 3;

		String[] r = { "01010101", "00110011", "00001111" };
		assertArrayEquals(r, Solution.testStore(n, f));
	}

	@Test
	void onNis16AndFis3TestStoreShouldReturnValue() {
		// b is not needed
		@SuppressWarnings("unused")
		int n = 16, b = 2, f = 3;

		String[] r = { "0101010101010101", "0011001100110011", "0000111100001111" };
		assertArrayEquals(r, Solution.testStore(n, f));
	}

	@Test
	void onNis32AndFis4TestStoreShouldReturnValue() {
		// b is not needed
		@SuppressWarnings("unused")
		int n = 32, b = 2, f = 4;

		String[] r = { "01010101010101010101010101010101", "00110011001100110011001100110011",
				"00001111000011110000111100001111", "00000000111111110000000011111111" };
		assertArrayEquals(r, Solution.testStore(n, f));
	}

	@Test
	void onNis40AndFis5TestStoreShouldReturnValue() {
		// b is not needed
		@SuppressWarnings("unused")
		int n = 40, b = 2, f = 5;

		String[] r = { "0101010101010101010101010101010101010101", "0011001100110011001100110011001100110011",
				"0000111100001111000011110000111100001111", "0000000011111111000000001111111100000000",
				"0000000000000000111111111111111100000000" };
		assertArrayEquals(r, Solution.testStore(n, f));
	}

	@Test
	void onNis8AndFis3processResultShouldReturnValue() {
		// b is not needed
		@SuppressWarnings("unused")
		int n = 8, b = 2, f = 3;

		String[] stub = { "010100", "001101", "000011" };
		String r = "5 7";
		assertEquals(r, Solution.processResult(n, f, stub));
	}

	@Test
	void onNis4AndandBis3Fis10processResultShouldReturnValue() {
		// b is not needed
		@SuppressWarnings("unused")
		int n = 4, b = 3, f = 10;

		String[] stub = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
		String r = "1 2 3";
		assertEquals(r, Solution.processResult(n, f, stub));
	}
}
