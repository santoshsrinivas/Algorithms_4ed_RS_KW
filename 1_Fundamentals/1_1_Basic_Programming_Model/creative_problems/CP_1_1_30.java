/* 
Array Exercise : Write a code fragment that creates an N-by-N boolean array a[][] such that a[i][j] is true if i and j are relatively prime(have no common factors), and false if otherwise

*/

public class CP_1_1_30 {
	static int gcd_co_prime(int x, int y) {
		if (y==0) return x;
		int r = x%y;
		return  gcd_co_prime(y,r);
	}
	public static void main(String[] args) {
		int N = 16;
		boolean[][] rp = new boolean[N][N];

		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				rp[i][j] = (gcd_co_prime(i,j) == 1) ? true : false;
			}
		}

		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(rp[i][j] +"(" + i + "," + j + ")" + "|");
			}
			System.out.println();
		}
	}
}

/*

$ java -cp . CP_1_1_30
false(0,0)|true(0,1)|false(0,2)|false(0,3)|false(0,4)|
true(1,0)|true(1,1)|true(1,2)|true(1,3)|true(1,4)|
false(2,0)|true(2,1)|false(2,2)|true(2,3)|false(2,4)|
false(3,0)|true(3,1)|true(3,2)|false(3,3)|true(3,4)|
false(4,0)|true(4,1)|false(4,2)|true(4,3)|false(4,4)|


*/
