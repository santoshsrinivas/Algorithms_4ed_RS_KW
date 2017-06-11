/*
Give the value of each of the following
		( 0 + 15) /2;
		2.0e-6 * 100000000.1;
		true && false || true && false;

		2.0e-6 is written as  2.0 X 10 power -6
*/
public class E_1_1_1 {
	public static void main(String[] args) {
		int x = ( 0 + 15) /2;
		double y = 2.0e-6 * 100000000.1;
		boolean z = true && false || true && false;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

/* 
$ java -cp . E_1_1_1
7
200.0000002
false

*/