package co;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * This second solution take next jump cell in a random way See Jump function It
 * is NOT correct for small matrix because it fails 3x5 for example (no
 * backtracking is implemented)
 * 
 * @author Alberto
 *
 */
public class Solution {

	public static void main(String... p) throws Exception {
		Scanner input = new Scanner(System.in);

		int t0 = input.nextInt();
		for (int t = 0; t < t0; t++) {
			int r = Integer.parseInt(input.next());
			int c = Integer.parseInt(input.next());

			// System.out.println("t=" + t + " t=" + t + " n=" + n + " b=" + b + " f=" + f);

			String result = solution(t + 1, r, c);
			System.out.println(result);
		}

		input.close();
	}

	public static class Cell {
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + i;
			result = prime * result + j;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cell other = (Cell) obj;
			if (i != other.i)
				return false;
			if (j != other.j)
				return false;
			return true;
		}

		@Override
		public String toString() {
			// return "Cell [i=" + i + ", j=" + j + "]";
			// return "(" + (i + 1) + " " + (j + 1) + (removed ? "R" : "") + ")";
			return (i + 1) + " " + (j + 1);
		}

		public Cell(int i, int j) {
			super();
			this.i = i;
			this.j = j;
			this.removed = false;
		}

		int i, j;
		boolean removed = false;
	}

	static Map<Cell, List<Cell>> m = new Hashtable<Cell, List<Cell>>();

	static List<Cell> cells = new LinkedList<Cell>();

	public static String solution(int t, int r, int c) {

		for (int i = 0; i < r; i++) {
			// System.out.println("i=" + i );

			for (int j = 0; j < c; j++) {
				// System.out.println("i=" + i + " j=" + j );

				init(r, c);

				// System.out.println(m);

				boolean finished = false;
				Cell start = getCell(c, i, j);
				List<Cell> res = new LinkedList<Cell>();
				res.add(start);
				start.removed = true;

				while (!finished) {

					Cell next = jump(r * c > 81, start);
					if (next == null) {
						finished = true;
					} else {
						res.add(next);
						// m.get(start).clear();
						start = next;
					}
				}

				// System.out.println(m);

				int l = res.size();
				// System.out.println(res);

				if (l == r * c) {
					String lst = new String();
					for (Cell ce : res) {
						lst = lst.concat(ce.toString()).concat("\n");
					}
					// System.out.println(lst);

					return "Case #" + t + ": POSSIBLE\n" + lst;
				}
			}
		}

		// System.out.println(m);

		return "Case #" + t + ": IMPOSSIBLE";
	}

	private static Cell jump(boolean random, Cell start) {
		int size = m.get(start).size();
		for (int k = 0; k < size; k++) {
			int k0 = random ? (int) (Math.random() * size) : k;
			Cell next = m.get(start).get(k0);
			if (!next.removed) {
				next.removed = true;
				return next;
			}
		}
		return null;
	}

	private static void init(int r, int c) {
		cells.clear();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				cells.add(new Cell(i, j));
			}
		}
		// System.out.println(cells);

		m.clear();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m.put(cells.get(i * c + j), new LinkedList<Cell>());
			}
		}
		// System.out.println(m);

		for (int i = 0; i < r; i++) {
			// System.out.println("i=" + i );

			for (int j = 0; j < c; j++) {
				// System.out.println("i=" + i + " j=" + j );

				for (int i0 = 0; i0 < r; i0++) {
					// System.out.println("i=" + i + " j=" + j + " i0=" + i0 );

					for (int j0 = 0; j0 < c; j0++) {

						if (i != i0 && j != j0) {
							// System.out.println("i=" + i + " j=" + j + " i0=" + i0 + " j0=" + j0);

							if (!notValid(i, j, i0, j0)) {
								// System.out.println("i=" + i + " j=" + j + " i0=" + i0 + " j0=" + j0);

								m.get(getCell(c, i, j)).add(getCell(c, i0, j0));
								// System.out.println(m);
							}
						}
					}
				}
			}
		}
	}

	private static Cell getCell(int c, int i, int j) {
		return cells.get(i * c + j);
	}

	private static boolean notValid(int i, int j, int i0, int j0) {

//		r = r'
//		c = c'
//		r - c = r' - c'
//		r + c = r' + c'

		boolean b = (j == j0) || (i == i0) || (i - j == i0 - j0) || (i + j == i0 + j0);
		if (!b) {
			// System.out.println("b=" + b + " i=" + i + " j=" + j + " i0=" + i0 + " j0=" +
			// j0);
		}
		return b;
	}
}
