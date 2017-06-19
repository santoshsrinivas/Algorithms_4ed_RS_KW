public class GCD {
	public static int gcd(int a, int b) {
		if (b == 0) return a; // if a is 0, the remainder is anyway 0
		int r = a % b;
		return gcd(b,r);
	}
	
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(gcd(a,b));
	}
}