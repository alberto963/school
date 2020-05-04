package co.graph;

public class Generator {
	
	public static int[][] graph(int r, int c) {
		int[][] m = new int[r][c];
		for (int i = 0; i < r; i++) {
			// System.out.println("i=" + i );

			for (int j = 0; j < c; j++) {
				// System.out.println("i=" + i + " j=" + j );
				m[i][j] = getNode(c, i, j);
			}
		}

		return m;
	}

	public static int[][] adjacencyMatrix(int r, int c) {
		int d = r * c;
		int[][] m = new int[d][d];

		// System.out.println(m);

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				for (int i0 = 0; i0 < r; i0++) {
					for (int j0 = 0; j0 < c; j0++) {
						if (valid(i, j, i0, j0)) {
							int start = getNode(c, i, j);
							int end = getNode(c, i0, j0);
							// System.out.println("start=" + start + " end=" + end);

							m[start][end] = 1;
						}
					}
				}
			}
		}
		
		return m;
	}

	public static int[][] adjacencyList(int r, int c, boolean adjacent) {
		int d = r * c;
		int[][] m = new int[d][d];
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < d; j++) {
				m[i][j] = -1;
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int k = 0;
				for (int i0 = 0; i0 < r; i0++) {
					for (int j0 = 0; j0 < c; j0++) {
						if (i0 == i && j0 == j)
							continue;
						
						int start = getNode(c, i, j);
						int end = getNode(c, i0, j0);
						if (adjacent && valid(i, j, i0, j0)) {							
							m[start][k++] = end;
						} else {
							if (!adjacent && !valid(i, j, i0, j0)) {							
								m[start][k++] = end;
							}
						}
					}
				}
			}
		}
		
		return m;
	}
	
	public static int[][] degreeMatrix(int r, int c) {
		int[][] m = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				for (int i0 = 0; i0 < r; i0++) {
					for (int j0 = 0; j0 < c; j0++) {
						if (i0 == i && j0 == j)
							continue;
						if (valid(i, j, i0, j0)) {
							m[i][j]++;
						}
					}
				}
			}
		}

		return m;
	}

	public static int degreeCell(int[][] m, int cell) {
		int r = 0;
		for (int i = 0; i < m.length; i++) {
			r += m[i][cell];
		}
		for (int j = 0; j < m[0].length; j++) {
			r += m[cell][j];
		}

		return r / 2;
	}

	public static int getNode(int c, int i, int j) {
		return c * i + j;
	}

	public static int getr(int c, int n) {
		return n / c;
	}

	public static int getc(int c, int n) {
		return n % c;
	}

	private static boolean valid(int i, int j, int i0, int j0) {

// r = r'
// c = c'
// r - c = r' - c'
// r + c = r' + c'

		boolean b = (j == j0) || (i == i0) || (i - j == i0 - j0) || (i + j == i0 + j0);
		if (!b) {
			// System.out.println("b=" + b + " i=" + i + " j=" + j + " i0=" + i0 + " j0=" +
			// j0);
		}

		return !b;
//		return i != i0;
//		return i != i0 && (j != 1);
	}
}
