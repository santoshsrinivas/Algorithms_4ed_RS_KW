/*
	Run the following program on the computer.
	What is the largest value of N for which this program takes less than 1 hour to compute the value of F(N)? Develop a better implementation of F(N) that saves computed values in an array.
*/
public class E_1_1_19 {
	// public static long F(int N) {
	// 	if (N == 0) return 0;
	// 	if (N == 1) return 1;
	// 	return F(N-1) + F(N-2);
	// }
	public static void main(String[] args) {
		int M = 50;
		int[] a = new int[M];
		a[0] = 0;
		a[1] = 1;
		for (int N=2; N<M; N++){
			a[N] = a[N-1] + a[N-2];
		}		

		for (int i=0;i<a.length;i++) {
			System.out.println( i + " " + a[i]);
		}
	}
}

/*
After 46 the number won't fit in the java's int

$ java -cp ../../../stdlib.jar:. E_1_1_19
0 0
1 1
2 1
3 2
4 3
5 5
6 8
7 13
8 21
9 34
10 55
11 89
12 144
13 233
14 377
15 610
16 987
17 1597
18 2584
19 4181
20 6765
21 10946
22 17711
23 28657
24 46368
25 75025
26 121393
27 196418
28 317811
29 514229
30 832040
31 1346269
32 2178309
33 3524578
34 5702887
35 9227465
36 14930352
37 24157817
38 39088169
39 63245986
40 102334155
41 165580141
42 267914296
43 433494437
44 701408733
45 1134903170
46 1836311903
47 -1323752223
48 512559680
49 -811192543

*/