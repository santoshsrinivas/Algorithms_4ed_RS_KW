import java.util.Arrays;
public class BinarySearchRecursive {
	public static int rank(int key, int[] a) {
		return rank(0,a.length-1,key,a);
	}
	public static int rank(int lo, int hi, int key, int[] a) {
		if (lo > hi) return -1;
		int mid = lo + (hi-lo)/2;
		if (key > a[mid]) return rank(mid+1,hi,key,a);
		else if ( key < a[mid]) return rank(lo,mid-1,key,a);
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