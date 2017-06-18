/*
Consider the following recursive function:
public static int mystery(int a, int b) {
	if (b == 0) return 0;
	if (b%2 == 0) return mystery(a+a, b/2);
	return mystery(a+a, b/2) + a;
}

what are the values of mystery(2,25) and mystery(3,11)? Given positive integers a and b, describe what value mystery(a,b) computes. Answer the same question, but replace the three + operators with * and replace return 0 wth return 1.
*/
public class E_1_1_18 {
	public static void main(String[] args) {
		System.out.println("mystery add " + mystery_add(1,2));
		System.out.println("mystery add " + mystery_add(2,3));
		System.out.println("mystery add " + mystery_add(3,4));
		System.out.println("mystery add " + mystery_add(3,11));
		System.out.println("mystery mul " + mystery_mul(2,25));
		System.out.println("mystery mul " + mystery_mul(1,2));
		System.out.println("mystery mul " + mystery_mul(2,3));
		System.out.println("mystery mul " + mystery_mul(3,4));
		System.out.println("mystery mul " + mystery_mul(2,5));
		System.out.println("mystery mul " + mystery_mul(3,11));
	}

	static int mystery_add(int a, int b) {
		if (b == 0) return 0;
		if (b%2 == 0) return mystery_add(a+a, b/2);
		return mystery_add(a+a, b/2) + a;
	}

	static int mystery_mul(int a, int b) {
		if (b == 0) return 1;
		if (b%2 == 0) return mystery_mul(a*a, b/2);
		return mystery_mul(a*a, b/2) * a;
	}
}

/* 
- With addition operator mystery(a,b) computes a*b 
- with multiplication operator mystery(a,b) computes a^b (i.e a to the power of b)

$ java -cp . E_1_1_18
mystery add 2
mystery add 6
mystery add 12
mystery add 33
mystery mul 33554432
mystery mul 1
mystery mul 8
mystery mul 81
mystery mul 32
mystery mul 177147


*/