/*
Write a version of BinarySearch that uses the recursive rank()  given on page 25 and traces the method calls. Each time the recursive method is called, print the argument values lo and hi, indented by the depth of the recursion. Hint: Add an argument to the recursive method that keeps track of the depth.
*/

import java.util.Arrays;
public class E_1_1_22 {
	public static int rank(int key, int[] a) {
		return rank(0,a.length-1,key,a,0);
	}
	public static int rank(int lo, int hi, int key, int[] a,int depth) {
		for(int i=0;i<depth;i++)
			System.out.print("-");
		System.out.println(" lo= " + lo + " hi= " + hi);

		if (lo > hi) return -1;

		int mid = lo + (hi-lo)/2;

		if (key > a[mid]) return rank(mid+1,hi,key,a,depth+1);
		else if ( key < a[mid]) return rank(lo,mid-1,key,a,depth+1);
		else return mid;
	}
	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();

		Arrays.sort(whitelist);

		while(!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if(rank(key,whitelist) == -1)
				System.out.println(key);
		}
	}
}

/* 
$ java -cp ../../../stdlib.jar:. E_1_1_22 /d/prog/datafiles/tinyW.txt < /d/prog/datafiles/tinyT.txt
 lo= 0 hi= 14
- lo= 0 hi= 6
-- lo= 4 hi= 6
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 8 hi= 10
--- lo= 8 hi= 8
---- lo= 9 hi= 8
50
 lo= 0 hi= 14
- lo= 0 hi= 6
-- lo= 0 hi= 2
--- lo= 0 hi= 0
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 12 hi= 14
--- lo= 14 hi= 14
---- lo= 15 hi= 14
99
 lo= 0 hi= 14
- lo= 0 hi= 6
-- lo= 4 hi= 6
--- lo= 4 hi= 4
 lo= 0 hi= 14
- lo= 0 hi= 6
-- lo= 4 hi= 6
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 12 hi= 14
--- lo= 14 hi= 14
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 12 hi= 14
 lo= 0 hi= 14
- lo= 0 hi= 6
-- lo= 0 hi= 2
 lo= 0 hi= 14
- lo= 0 hi= 6
-- lo= 0 hi= 2
--- lo= 0 hi= 0
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 8 hi= 10
--- lo= 8 hi= 8
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 12 hi= 14
--- lo= 12 hi= 12
 lo= 0 hi= 14
- lo= 0 hi= 6
-- lo= 0 hi= 2
--- lo= 2 hi= 2
---- lo= 3 hi= 2
13
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 8 hi= 10
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 12 hi= 14
--- lo= 14 hi= 14
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 12 hi= 14
--- lo= 12 hi= 12
 lo= 0 hi= 14
- lo= 8 hi= 14
-- lo= 12 hi= 14
--- lo= 12 hi= 12
 lo= 0 hi= 14
- lo= 8 hi= 14


*/