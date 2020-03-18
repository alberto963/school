package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {
	int[] primes = { 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193,
			197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313,
			317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431 };
	
	private int[] encript(String clear) {
		int[] a = new int[clear.length() - 1];
		for (int c = 0; c < clear.length() - 1; c++) {
//			System.out.println(clear.charAt(c) - 65);
			a[c] = primes[clear.charAt(c) - 65] * primes[clear.charAt(c + 1) - 65];
		}
		return a;
	}
	
	@Test
	void on103ShouldReturnValue() {
		int[] a = { 217, 1891, 4819, 2291, 2987, 3811, 1739, 2491, 4717, 445, 65, 1079, 8383, 5353, 901, 187, 649, 1003,
				697, 3239, 7663, 291, 123, 779, 1007, 3551, 1943, 2117, 1679, 989, 3053 };

		int n = 101;

		String r = "Case #1: CJQUIZKNOWBEVYOFDPFLUXALGORITHMS";
		assertEquals(r, Solution.solution(1, n, a));
	}

	@Test
	void on10000ShouldReturnValue() {
		int[] a = { 3292937, 175597, 18779, 50429, 375469, 1651121, 2102, 3722, 2376497, 611683, 489059, 2328901,
				3150061, 829981, 421301, 76409, 38477, 291931, 730241, 959821, 1664197, 3057407, 4267589, 4729181,
				5335543 };

		int n = 10000;

		String r = "Case #2: SUBDERMATOGLYPHICFJKNQVWXZ";
		assertEquals(r, Solution.solution(2, n, a));
	}

	@Test
	void on10100ShouldReturnValue() {
		int[] a = { 3292937, 175597, 18779, 50429, 375469, 1651121, 2102, 3722, 2376497, 611683, 489059, 2328901,
				3150061, 829981, 421301, 76409, 38477, 291931, 730241, 959821, 1664197, 3057407, 4267589, 4729181,
				5335543 };

		int n = 10100;

		String r = "Case #3: SUBDERMATOGLYPHICFJKNQVWXZ";
		assertEquals(r, Solution.solution(3, n, a));
	}

	@Test
	void onGen1ShouldReturnValue() {

		String clear = "ABCDEFGHILMNOPQRSTUVZWYJXKZZ";
		
		int[] a = encript(clear);

		int n = 10100;

		String r = "Case #4: " + clear;
		assertEquals(r, Solution.solution(4, n, a));
	}
	
	@Test
	void onGen2ShouldReturnValue() {

		String clear = "ABABCDEFGHILMNOPQRSTUVZWYJXKZZ";
		
		int[] a = encript(clear);

		int n = 10100;

		String r = "Case #5: " + clear;
		assertEquals(r, Solution.solution(5, n, a));
	}
	
	@Test
	void onGen3ShouldReturnValue() {

		String clear = "BABACDEFGHILMNOPQRSTUVZWYJXKZZ";
		
		int[] a = encript(clear);

		int n = 10100;

		String r = "Case #6: " + clear;
		assertEquals(r, Solution.solution(6, n, a));
	}
	
	@Test
	void onABCShouldReturnValue() {

		String clear = "ABC";
		
		int[] a = encript(clear);

		int n = 10100;

		String r = "Case #7: " + clear;
		assertEquals(r, Solution.solution(7, n, a));
	}
	
	@Test
	void onBACShouldReturnValue() {

		String clear = "BAC";
		
		int[] a = encript(clear);

		int n = 10100;

		String r = "Case #8: " + clear;
		assertEquals(r, Solution.solution(8, n, a));
	}
	
	@Test
	void onCBAShouldReturnValue() {

		String clear = "CBA";
		
		int[] a = encript(clear);

		int n = 10100;

		String r = "Case #9: " + clear;
		assertEquals(r, Solution.solution(9, n, a));
	}
	
	@Test
	void onCCCBBBAAAShouldReturnValue() {

		String clear = "CCCBBBAAA";
		
		int[] a = encript(clear);

		int n = 10100;

		String r = "Case #10: " + clear;
		assertEquals(r, Solution.solution(10, n, a));
	}
	
	@Test
	void onBABABACBABABACABABABABShouldReturnValue() {

		String clear = "BABABACBABABACABABABAB";
		
		int[] a = encript(clear);

		int n = 10100;

		String r = "Case #11: " + clear;
		assertEquals(r, Solution.solution(11, n, a));
	}
}
