package co.graph;

import java.util.Hashtable;

import java.util.Map;
/*
 * Java program for solution of Hamiltonian Path problem using backtracking. As
 * it is NP-Complete, it will not stay in 20 secs for r > 8 and c > 8. Also it
 * always start from cell 0, that may not be a starting point for a Hamiltonian
 * path, even if it exists.
 * 
 * This code is modified after code provided by Abhishek Shankhadhar
 * 
 */
public class HamiltonianPath {
	
	private int V;
	private int path[];
	private Map<Integer, Boolean> safe;

	public HamiltonianPath(int V) {
		this.V = V;
		this.safe = new Hashtable<Integer, Boolean>();
	}

	/*
	 * A recursive utility function to solve hamiltonian path problem
	 * This code has been contributed by Amit Khandelwal.
	 */
	boolean hamPathUtil(int graph[][], int path[], int pos) {
		/*
		 * Base case: If all vertices are included in Hamiltonian Path
		 */
		if (pos == V) {
			return true;
		}

		/*
		 * Try different vertices as a next candidate in Hamiltonian Path.
		 */
		for (int v = 0; v < V; v++) {
			/*
			 * Check if this vertex can be added to Hamiltonian Path
			 */
			if (isSafe(v, graph, path, pos)) {
				path[pos] = v;
//				System.out.println(Arrays.toString(path));

				/*
				 * Recur to construct rest of the path
				 */
				if (hamPathUtil(graph, path, pos + 1)) {
					return true;
				}

				safe.put(v, false);

				/*
				 * If adding vertex v doesn't lead to a solution, then remove it
				 */
				path[pos] = -1;
			}
		}

		/*
		 * If no vertex can be added to Hamiltonian Path constructed so far, then return
		 * false
		 */
		return false;
	}

	/*
	 * A utility function to check if the vertex v can be added at index 'pos' in
	 * the Hamiltonian Path constructed so far (stored in 'path[]')
	 */
	boolean isSafe(int v, int graph[][], int path[], int pos) {
		if (pos == 0) {
			safe.put(v, true);
			return true;
		}

		/*
		 * Check if this vertex is an adjacent vertex of the previously added vertex.
		 */
		if (graph[path[pos - 1]][v] == 0) {
			return false;
		}

		/*
		 * Check if the vertex has already been included.
		 */
		if (safe.get(v) != null && safe.get(v)) {
			return false;
		}

		safe.put(v, true);
		// System.out.println("Adding v=" + v);
		return true;
	}

	/*
	 * This function solves the Hamiltonian Path problem using Backtracking. It
	 * mainly uses hamPathUtil() to solve the problem. It returns false if there is
	 * no Hamiltonian Path possible starting from 0, otherwise return true and
	 * deliver the path in path array. Please note that there may be more than one
	 * solutions, this function prints one of the feasible solutions.
	 */
	public int[] hamPath(int graph[][]) {
		path = new int[V];
		for (int i = 0; i < V; i++) {
			path[i] = -1;
		}

		if (hamPathUtil(graph, path, 0) == false) {
			// System.out.println("\nSolution does not exist");
			return null;
		}

		return path;
	}
}
