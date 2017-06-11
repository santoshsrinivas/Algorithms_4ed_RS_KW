/* 
Write a code fragment to print thye transposition (rows and columns changed) of a two-dimensional
 array with M rows and N columns.
 */

public class E_1_1_13 {
	public static void main(String[] args) {
		int M = 3; // M rows
		int N = 4; // N cols

		int a[][] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		int b[][] = new int[N][M];

		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				b[j][i] = a[i][j];
				System.out.print("("+i+","+j+") : "+a[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println("After transposition");

		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				System.out.print("("+i+","+j+") : "+b[i][j] + " | ");
			}
			System.out.println();
		}

	}
}
/*
$ java -cp . E_1_1_13
(0,0) : 1 | (0,1) : 2 | (0,2) : 3 | (0,3) : 4 |
(1,0) : 5 | (1,1) : 6 | (1,2) : 7 | (1,3) : 8 |
(2,0) : 9 | (2,1) : 10 | (2,2) : 11 | (2,3) : 12 |
After transposition
(0,0) : 1 | (0,1) : 5 | (0,2) : 9 |
(1,0) : 2 | (1,1) : 6 | (1,2) : 10 |
(2,0) : 3 | (2,1) : 7 | (2,2) : 11 |
(3,0) : 4 | (3,1) : 8 | (3,2) : 12 |

*/
