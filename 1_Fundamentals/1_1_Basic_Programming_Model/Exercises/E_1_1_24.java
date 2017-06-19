/*
Give the sequence of values of p and q that are computed when Euclid's algorithm is used to compute the greatest common divisor of 105 and 24. Extend the code given on page 2 to develop a program Euclid that takes two integers from the command line and computes their greatest common divisor, printing out the two arguments for each call on the recursive method. Use yuour program to compute the greatest common divisor of 1111111 and 1234567
*/
public class E_1_1_24 {
	public static int Euclid(int a, int b) {
		System.out.println("a= " + a + " , b= " + b);
		if (b == 0) return a; // if a is 0, the remainder is anyway 0
		int r = a % b;
		return Euclid(b,r);
	}
	
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(Euclid(a,b));
	}
}

/* 
$ java -cp . E_1_1_24 1111111 1234567
a= 1111111 , b= 1234567
a= 1234567 , b= 1111111
a= 1111111 , b= 123456
a= 123456 , b= 7
a= 7 , b= 4
a= 4 , b= 3
a= 3 , b= 1
a= 1 , b= 0
1

*/
