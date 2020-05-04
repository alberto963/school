package co.graph;

public class OreTheorem {

	public static boolean isHamiltonian(int r, int c) {
		int d = r * c;

		int[][] deg = Generator.degreeMatrix(r, c);
		int[][] nal = Generator.adjacencyList(r, c, false);
		@SuppressWarnings("unused")
		int[][] adj = Generator.adjacencyList(r, c, true);

//		System.out.println(Arrays.deepToString(deg));
//		System.out.println(Arrays.deepToString(nal));
//		System.out.println(Arrays.deepToString(adj));

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				if (nal[i][j] == -1) {
					continue;
				}

				int i0 = Generator.getr(c, i);
				int j0 = Generator.getc(c, j);

				int degV = deg[i0][j0];
				int degW = deg[i0][Generator.getc(c, nal[i][j])];

				// System.out.println(degV + " "+ degW);

				if (degV + degW < d) {
					return false;
				}
			}
		}

		return true;
	}
}
