/*
Remove Duplicates. Modify the test client in BinarySearch to remove any duplicate keys in the whitelist after the sort	.
*/
import java.util.Arrays;
import java.util.ArrayList;
public class CP_1_1_28 {

	public static int rank (int key, ArrayList<Integer> a) {
		int lo=0;
		int hi=a.size()-1;
		while(lo <= hi) {
			int mid = lo + (hi-lo)/2;

			if (key > a.get(mid)) lo = mid+1;
			else if (key < a.get(mid)) hi = mid-1;
			else return mid;
		}

		return -1;
	}
	public static void main(String[] args) {
		In in = new In(args[0]);
		int [] whitelist = in.readAllInts();		

		Arrays.sort(whitelist);
		ArrayList<Integer> u_whitelist = new ArrayList<Integer>();
		u_whitelist.add(whitelist[0]);
		for (int i=1;i<whitelist.length;i++) {
			if (whitelist[i] != whitelist[i-1]) {
				u_whitelist.add(whitelist[i]);
			}
		}


		while(!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if( rank(key,u_whitelist) == -1) {
				System.out.println(key);
			}
		}

	}
}

/*

$ java -cp ../../../stdlib.jar:. CP_1_1_28 /d/prog/datafiles/largeW.txt < /d/prog/datafiles/largeT.txt | wc
 367966  367966 3643502

*/
