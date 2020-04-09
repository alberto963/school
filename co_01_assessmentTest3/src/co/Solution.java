package co;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

	public static int solution(String s, String t) {

		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		try {
			Date ds = df.parse(s);
			Date dt = df.parse(t);

			long ts = ds.getTime();
			long tt = dt.getTime();
			long diff = tt - ts;
			int secs = (int) (diff / 1000);
			String[] a = new String[secs + 1];
			for (int i = 0; i <= secs; i++) {
				Date d = new Date(ts + i * 1000);
				String clockTime = df.format(d);
				a[i] = clockTime.replaceAll(":", "");
			}

			// System.out.println("a=" + Arrays.toString(a));

			return solutionCount(a);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static int solutionCount(String[] a) {
		int r = 0;
		for (int i = 0; i < a.length; i++) {
			int[] m = new int[10];
			String[] s = a[i].split("");

			for (int j = 0; j < s.length; j++) {
				int p = Integer.parseInt(s[j]);
				m[p] = m[p] + 1;
			}

			int c = 0;
			for (int p = 0; p < m.length; p++) {
				if (m[p] != 0) {
					c++;
				}
			}

			if (c < 3) {
				r++;
			}
		}

		return r;
	}
}
