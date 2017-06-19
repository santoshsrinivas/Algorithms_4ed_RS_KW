/*
	Data files:   http://algs4.cs.princeton.edu/11model/tinyW.txt
 *                http://algs4.cs.princeton.edu/11model/tinyT.txt
 *                http://algs4.cs.princeton.edu/11model/largeW.txt
 *                http://algs4.cs.princeton.edu/11model/largeT.txt

 */
import java.util.Arrays;
public class BinarySearch {

	public static int rank (int key, int[] a) {
		int lo=0;
		int hi=a.length-1;
		while(lo <= hi) {
			int mid = lo + (hi-lo)/2;

			if (key > a[mid]) lo = mid+1;
			else if (key < a[mid]) hi = mid-1;
			else return mid;
		}

		return -1;
	}
	public static void main(String[] args) {
		In in = new In(args[0]);
		int [] whitelist = in.readAllInts();		

		Arrays.sort(whitelist);

		while(!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if( rank(key,whitelist) == -1) {
				System.out.println(key);
			}
		}

	}
}

/* 
$ java -cp ../../../stdlib.jar:. BinarySearch /d/prog/datafiles/tinyW.txt < /d/prog/datafiles/tinyT.txt
50
99
13


$ java -cp ../../../stdlib.jar:. BinarySearch /d/prog/datafiles/largeW.txt < /d/prog/datafiles/largeT.txt | wc
 367966  367966 3643502

*/