package co_02_binaryGap;

public class Solution {
	public static int max = 30;
	public static boolean[] mem = new boolean[max + 1];

	public static int solution(int n) {

		for (int i = max; i >= 0; i--) {
			int bitmask = (int) Math.pow(2, i);

			// System.out.println(i + " " + ((n & bitmask) != 0));
			mem[i] = ((n & bitmask) != 0);
		}

		// System.out.println("n= " + n + " " + Arrays.toString(mem));

		int r = 0;
		int c = 0;
		boolean count = false;
		for (int i = 0; i < mem.length; i++) {
			if (!count && mem[i]) {
				count = true;
				continue;
			}

			if (count && mem[i]) {
				if (c > r) {

					r = c;
					// System.out.println("n= " + n + " r= " + r + " c= " + c);

				}
				c = 0;

				continue;
			}

			if (count && !mem[i]) {
				c++;
				// System.out.println("n= " + n + " i= " + i + " c= " + c);

			}
		}

		return r;
	}
}
