import java.util.Arrays;
public class E_1_1_23 {
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
		String inc_exc = "";
		if (args.length == 2)
			inc_exc = args[1];

		Arrays.sort(whitelist);

		if (inc_exc.equals("+")) {

			while(!StdIn.isEmpty()) {
				int key = StdIn.readInt();
				if( rank(key,whitelist) == -1) {
					System.out.println(key);
				}
			}
		} else if (inc_exc.equals("-")) {

			while(!StdIn.isEmpty()) {
				int key = StdIn.readInt();
				if( rank(key,whitelist) != -1) {
					System.out.println(key);
				}
			}
		} else {

			while(!StdIn.isEmpty()) {
				int key = StdIn.readInt();
				if( rank(key,whitelist) == -1) {
					System.out.println(key);
				}
			}
		}

		
	}
}


/* 
$ java -cp ../../../stdlib.jar:. E_1_1_23 /d/prog/datafiles/tinyW.txt + < /d/prog/datafiles/tinyT.txt
50
99
13

$ java -cp ../../../stdlib.jar:. E_1_1_23 /d/prog/datafiles/tinyW.txt - < /d/prog/datafiles/tinyT.txt
23
10
18
23
98
84
11
10
48
77
54
98
77
77
68

$ java -cp ../../../stdlib.jar:. E_1_1_23 /d/prog/datafiles/tinyW.txt < /d/prog/datafiles/tinyT.txt
50
99
13


*/