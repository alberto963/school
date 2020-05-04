package co;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolutionWrong {

	@Test
	void onReq2andCeq5ShouldReturnValue() {

		int i = 0;
		int r = 2;
		int c = 5;

//		String res = "Case #" + i + ": POSSIBLE\n" + "1 3\n" + "2 1\n" + "1 4\n" + "2 2\n" + "1 5\n" + "2 3\n" + "1 1\n"
//				+ "2 4\n" + "1 2\n" + "2 5\n";

		String res = "Case #" + i + ": POSSIBLE\n" + "1 1\n" + "2 3\n" + "1 5\n" + "2 2\n" + "1 4\n" + "2 1\n" + "1 3\n"
				+ "2 5\n" + "1 2\n" + "2 4\n";

		String solution = SolutionWrong.solution(i, r, c);
		// System.out.println(solution);
		assertEquals(res, solution);
	}

	@Test
	void onReq2andCeq2ShouldReturnValue() {

		int i = 1;
		int r = 2;
		int c = 2;

		String res = "Case #" + i + ": IMPOSSIBLE";
		String solution = SolutionWrong.solution(i, r, c);
		assertEquals(res, solution);
	}

	@Test
	void onReq3andCeq3ShouldReturnValue() {

		int i = 2;
		int r = 3;
		int c = 3;

		String res = "Case #" + i + ": IMPOSSIBLE";
		String solution = SolutionWrong.solution(i, r, c);
		assertEquals(res, solution);
	}

	@Test
	void onReq3andCeq5ShouldReturnValue() {

		int i = 3;
		int r = 3;
		int c = 5;

		String res = "Case #" + i + ": POSSIBLE\n" + "1 1\n" + "2 3\n" + "1 5\n" + "2 1\n" + "1 3\n" + "2 5\n" + "3 2\n"
				+ "2 4\n" + "3 1\n" + "1 2\n" + "3 3\n" + "1 4\n" + "3 5\n" + "2 2\n" + "3 4\n";
		
		String solution = SolutionWrong.solution(i, r, c);
		assertEquals(res, solution);
	}

//	@Test
//	void onReq20andCeq20ShouldReturnValue() {
//
//		int i = 3;
//		int r = 20;
//		int c = 20;
//
//		String res = "Case #" + i + ": IMPOSSIBLE";
//		String solution = SolutionWrong.solution(i, r, c);
//		assertEquals(res, solution);
//	}

//	@Test
//	void onReq10andCeq10ShouldReturnValue() {
//
//		int i = 4;
//		int r = 10;
//		int c = 10;
//
//		String res = "Case #" + i + ": IMPOSSIBLE";
//		String solution = SolutionWrong.solution(i, r, c);
//		assertEquals(res, solution);
//	}
	
	@Test
	void onReq9andCeq9ShouldReturnValue() {

		int i = 4;
		int r = 9;
		int c = 9;

		String res = "Case #" + i + ": IMPOSSIBLE";
		String solution = SolutionWrong.solution(i, r, c);
		assertEquals(res, solution);
	}
	
	@Test
	void onReq2andCeq20ShouldReturnValue() {

		int i = 4;
		int r = 2;
		int c = 20;

		String res = "Case #" + i + ": POSSIBLE";
		String solution = SolutionWrong.solution(i, r, c);
		assertEquals(res, solution);
	}

	@Test
	void onReq2andCeq15ShouldReturnValue() {

		int i = 5;
		int r = 2;
		int c = 15;

		String res = "Case #" + i + ": POSSIBLE";
		String solution = SolutionWrong.solution(i, r, c);
		assertEquals(res, solution);
	}

	@Test
	void onReq2andCeq10ShouldReturnValue() {

		int i = 6;
		int r = 2;
		int c = 10;

		String res = "Case #" + i + ": POSSIBLE";
		String solution = SolutionWrong.solution(i, r, c);
		assertEquals(res, solution);
	}
}
