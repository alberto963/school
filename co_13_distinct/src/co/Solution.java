package co;

import java.util.Hashtable;
import java.util.Map;

public class Solution {

	public static int solution(int[] a) {
		Map<Integer, Integer> m = new Hashtable<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			m.putIfAbsent(a[i], 1);
		}
		
		int r = m.keySet().size();

		return r;
	}
}
