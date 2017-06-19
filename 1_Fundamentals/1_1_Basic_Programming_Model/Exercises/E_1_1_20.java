/*
	Write a recursive static method that computes the value of ln(N!)
*/
public class E_1_1_20 {
	static int factorial(int x) {
		if (x == 1) return 1;
		return factorial(x-1) * x;

	}
	public static void main(String[] args) {
		int N = 6;
		System.out.println("ln("+N+"!) = "+ Math.log(factorial(N)));
	}
}

/*
$ java -cp . E_1_1_20
ln(6!) = 6.579251212010101


*/