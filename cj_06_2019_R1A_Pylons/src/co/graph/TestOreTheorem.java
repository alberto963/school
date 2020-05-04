package co.graph;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestOreTheorem {

	@Test
	void onReq2andCeq5BuildForRowShouldReturnValue() {

		int r = 2;
		int c = 5;

		int[][] solution = Generator.graph(r, c);
		//System.out.println("Initial solution=" + Arrays.deepToString(solution));

		int[][] res = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } };
		assertArrayEquals(res, solution);
	}

	@Test
	void onReq2andCeq5DegreeMatrixdShouldReturnValue() {

		int r = 2;
		int c = 5;

		int[][] solution = Generator.degreeMatrix(r, c);
		//System.out.println("Initial solution=" + Arrays.deepToString(solution));

		int[][] res = { { 3, 2, 2, 2, 3 }, { 3, 2, 2, 2, 3 } };
		assertArrayEquals(res, solution);
	}

	@Test
	void onReq2andCeq5DegreeCellShouldReturnValue() {

		int r = 2;
		int c = 5;

		int[][] m = Generator.adjacencyMatrix(r, c);
		//System.out.println("m=" + Arrays.deepToString(m));

		int cell = 1;
		int solution = Generator.degreeCell(m, cell);

		int res = 2;

		assertEquals(res, solution);
	}

	@Test
	void onReq2andCeq5DegreeCell4ShouldReturnValue() {

		int r = 2;
		int c = 5;

		int[][] m = Generator.adjacencyMatrix(r, c);
		// System.out.println("m=" + Arrays.deepToString(m));

		int cell = 4;
		int solution = Generator.degreeCell(m, cell);

		int res = 3;

		assertEquals(res, solution);
	}

	@Test
	void onReq2andCeq5AdjListShouldReturnValue() {

		int r = 2;
		int c = 5;

		int[][] solution = Generator.adjacencyList(r, c, true);
		// System.out.println("Initial solution=" + Arrays.deepToString(solution));

		int[][] res = { { 7, 8, 9, -1, -1, -1, -1, -1, -1, -1 }, { 8, 9, -1, -1, -1, -1, -1, -1, -1, -1 },
				{ 5, 9, -1, -1, -1, -1, -1, -1, -1, -1 }, { 5, 6, -1, -1, -1, -1, -1, -1, -1, -1 },
				{ 5, 6, 7, -1, -1, -1, -1, -1, -1, -1 }, { 2, 3, 4, -1, -1, -1, -1, -1, -1, -1 },
				{ 3, 4, -1, -1, -1, -1, -1, -1, -1, -1 }, { 0, 4, -1, -1, -1, -1, -1, -1, -1, -1 },
				{ 0, 1, -1, -1, -1, -1, -1, -1, -1, -1 }, { 0, 1, 2, -1, -1, -1, -1, -1, -1, -1 } };

		assertArrayEquals(res, solution);
	}

	@Test
	void onReq2andCeq5NonAdjListShouldReturnValue() {

		int r = 2;
		int c = 5;

		int[][] solution = Generator.adjacencyList(r, c, false);
		// System.out.println("solution=" + Arrays.deepToString(solution));

		int[][] res = { { 1, 2, 3, 4, 5, 6, -1, -1, -1, -1 }, { 0, 2, 3, 4, 5, 6, 7, -1, -1, -1 },
				{ 0, 1, 3, 4, 6, 7, 8, -1, -1, -1 }, { 0, 1, 2, 4, 7, 8, 9, -1, -1, -1 },
				{ 0, 1, 2, 3, 8, 9, -1, -1, -1, -1 }, { 0, 1, 6, 7, 8, 9, -1, -1, -1, -1 },
				{ 0, 1, 2, 5, 7, 8, 9, -1, -1, -1 }, { 1, 2, 3, 5, 6, 8, 9, -1, -1, -1 },
				{ 2, 3, 4, 5, 6, 7, 9, -1, -1, -1 }, { 3, 4, 5, 6, 7, 8, -1, -1, -1, -1 } };

		assertArrayEquals(res, solution);
	}

	@Test
	void onReq5andCeq2BuildForRowShouldReturnValue() {

		int r = 5;
		int c = 2;

		int[][] solution = Generator.graph(r, c);
		//System.out.println("Initial solution=" + Arrays.deepToString(solution));

		int[][] res = { { 0, 1 }, { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 } };
		assertArrayEquals(res, solution);
	}

	@Test
	void onReq5andCeq2DegreeMatrixdShouldReturnValue() {

		int r = 5;
		int c = 2;

		int[][] solution = Generator.degreeMatrix(r, c);
		//System.out.println("Initial solution=" + Arrays.deepToString(solution));

		int[][] res = { { 3, 3 }, { 2, 2 }, { 2, 2 }, { 2, 2 }, { 3, 3 } };
		assertArrayEquals(res, solution);
	}

	@Test
	void onReq5andCeq2DegreeCell1ShouldReturnValue() {

		int r = 5;
		int c = 2;

		int[][] m = Generator.adjacencyMatrix(r, c);
		//System.out.println("m=" + Arrays.deepToString(m));

		int cell = 1;
		int solution = Generator.degreeCell(m, cell);

		int res = 3;

		assertEquals(res, solution);
	}

	@Test
	void onReq5andCeq2DegreeCell4ShouldReturnValue() {

		int r = 5;
		int c = 2;

		int[][] m = Generator.adjacencyMatrix(r, c);
		//System.out.println("m=" + Arrays.deepToString(m));

		int cell = 4;
		int solution = Generator.degreeCell(m, cell);

		int res = 2;

		assertEquals(res, solution);
	}

	@Test
	void onReq2andCeq2IsHamShouldReturnValue() {

		int r = 2;
		int c = 2;
		
		boolean solution = OreTheorem.isHamiltonian(r, c);
		// System.out.println(solution);
		boolean res = false;
		assertEquals(res, solution);
	}
	
	@Test
	void onReq2andCeq5IsHamShouldReturnValue() {

		int r = 2;
		int c = 5;

		boolean solution = OreTheorem.isHamiltonian(r, c);
		// System.out.println(solution);
		boolean res = false;
		assertEquals(res, solution);
	}

	@Test
	void onReq5andCeq2IsHamShouldReturnValue() {

		int r = 5;
		int c = 2;
		
		boolean solution = OreTheorem.isHamiltonian(r, c);
		// System.out.println(solution);
		boolean res = false;
		assertEquals(res, solution);
	}
}
