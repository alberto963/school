package co;

public class Solution {

	public static int solution(int a) {
		String s = Integer.toString(a);

		int m = s.length() / 2;
		String res = "";
		for (int i = 0; i < m; i++) {
			res = res + s.charAt(i);
			res = res + s.charAt(s.length() - i - 1);
		}

		if (s.length() % 2 != 0) {
			res = res + s.charAt(m);
		}
		
		int r = Integer.parseInt(res);

		return r;
	}
}
