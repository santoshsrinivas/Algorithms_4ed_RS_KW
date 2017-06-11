public class E_1_1_9 {
	public static void main(String[] args) {
		String s = "";
		int N=10;
		for ( int n=N; n>0; n/=2)
			s=(n%2) + s;

		System.out.println(s);

		System.out.println(Integer.toBinaryString(N));
	}
}

/* 
$ java -cp . E_1_1_9
1010
1010
*/