package co_07_frogJmp;

public class Solution {

	public static int solution(int x,int y,int d ) {

		int s = y - x;
		int j0 = s/d;
				
		int t = s%d == 0 ? 0 : 1;

		return j0 + t;
	}
}
