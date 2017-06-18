/*
	Write a static maethod histogram() that takes an array a[] of int values and an integer M as arguments and returns an array of length M whose ith entry is the number of times the integer i appeared in the argument array. if the values in a[] are all between 0 and M-1, the sum of the values in the returned array should be equal to a.length
*/
public class E_1_1_15 {
	public static void main(String[] args) {
		int a[] = {1,2,0,2,2,1,1};
		int M =3;
		int[] b = new int[M];

		b = histogram(a,M);
		for(int i=0;i<b.length;i++){
			System.out.print(b[i] + ", ");
		}
	}

	static int[] histogram(int[] a, int M ){
		int[] b = new int[M];
		for(int i=0;i<a.length;i++){
			if ( a[i] < M)
				b[a[i]]++;
		}

		return b;

	}
}

/* 
$ java -cp ../../../stdlib.jar:. E_1_1_15
1, 3, 3,

*/