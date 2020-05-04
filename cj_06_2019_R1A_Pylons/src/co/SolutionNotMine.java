package co;

import java.util.Arrays;

public class SolutionNotMine {

	public static boolean valid(int i, int j, int k, int m) {
		return !(i == k || j == m || (i + j) == (k + m) || (i - j) == (k - m));
	}

	public static String solution(int testNumber, int r, int c) {

		String res = new String();

		res = res.concat("Case #" + testNumber + ": ");

		for (int endRow = 0; endRow < r; endRow++) {
			System.out.println("LOOP endRow=" + endRow);

			outer: for (int endCol = 0; endCol < c; endCol++) {
				System.out.println("LOOP endCol=" + endCol);

				int startRow = endRow, startCol = endCol;

				// Build degree table for all the cells
				int[][] deg = buildDegreeTable(r, c);
				System.out.println("Initial deg=" + Arrays.deepToString(deg));

				// Initialize path result
				int d = r * c;
				Cell[] path = new Cell[d];

				// Take note of the cell visited
				boolean[][] visited = new boolean[r][c];

				// Loop on all the cells, taking note of the ones that are visited.
				// If we get to the about (-1) the end of the loop wee have found a hamiltonian
				// path.

				for (int i = 0; i < d; i++) {
					visited[startRow][startCol] = true;
					path[i] = new Cell(startRow, startCol);
					System.out.println("path=" + Arrays.toString(path));

					if (i == d - 1) {
						// End condition (POSSIBLE)
						break;
					}

					// Decrease the degree of all 'landing' cells
					for (int i0 = 0; i0 < r; i0++) {
						for (int j0 = 0; j0 < c; j0++) {
							if (valid(startRow, startCol, i0, j0))
								deg[i0][j0]--;
						}
					}
					System.out.println("deg=" + Arrays.deepToString(deg));

					// Look for next cell: Takes the one that has not been visited before, that is
					// valid and the one that has the lowest degree
					int nextRow = -1, nextCol = -1;
					for (int i0 = 0; i0 < r; i0++) {
						for (int j0 = 0; j0 < c; j0++) {
							if (!visited[i0][j0] && valid(startRow, startCol, i0, j0)
									&& (nextRow == -1 || deg[i0][j0] < deg[nextRow][nextCol])) {
								nextRow = i0;
								nextCol = j0;
							}
						}
					}

					if (nextRow != -1) {
						System.out.println("nextCell found nextRow=" + nextRow + " nextCol=" + nextCol);
					}

					if (nextRow == -1) {
						System.out.println("nextCell ***NOT*** found");
						// Restart from a another (the next) initial cell (next col or next row)

						continue outer;
					}

					startRow = nextRow;
					startCol = nextCol;
				}

				res = res.concat("POSSIBLE\n");
				for (Cell p : path) {
					res = res.concat((p.x + 1) + " " + (p.y + 1) + "\n");
				}
				return res;
			}
		}
		res = res.concat("IMPOSSIBLE");
		return res;
	}

	private static int[][] buildDegreeTable(int r, int c) {
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

		// System.out.println("m=" + Arrays.deepToString(m));

		return m;
	}

	static class Cell {
		@Override
		public String toString() {
			return "(" + x + " " + y + ")";
		}

		public int x;
		public int y;

		public Cell(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
