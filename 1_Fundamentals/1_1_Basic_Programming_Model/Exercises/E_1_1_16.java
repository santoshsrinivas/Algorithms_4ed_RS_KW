/*
	Give the value of exR1(6) 
*/
public class E_1_1_16 {
	public static void main(String[] args) {
		System.out.println(exR1(6));
	}

	public static String exR1(int n) {
		if ( n <= 0) return "";
		return exR1(n-3) + n + exR1(n-2) + n;
	}
}

/*

$ java -cp ../../../stdlib.jar:. E_1_1_16
311361142246

*/