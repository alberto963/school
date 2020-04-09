package co;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

	public static int solution(int[] a) {

		Map<Integer, Integer> m = new Hashtable<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			Integer v = m.putIfAbsent(Math.abs(a[i]), a[i] >= 0 ? 1 : -1);
			if (v != null) {
				if (v != 0) {
					if (v == -1 && a[i] >= 0)
						m.put(Math.abs(a[i]), 0);
					else if (v == 1 && a[i] < 0)
						m.put(Math.abs(a[i]), 0);
				}
			}
		}

		// System.out.println("m=" + m);

		Map<Integer, Integer> f = m.entrySet().stream().filter(map -> map.getValue().intValue() == 0)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		// System.out.println("f=" + f);

		if (f.keySet().size() == 0)
			return 0;

		int r = f.keySet().stream().max(Comparator.comparing(Integer::valueOf)).get();

		return r;
	}
}
