/*
Sorting three numbers. Suppose that the variables a,b,c, adn t are all of the same numeric primitive type.
show that the following code jpusts a,b and c in ascending order.
*/
public class CP_1_1_26 {
	public static void main(String[] args) {
		int a = 50;
		int b = 20;
		int c = 30;
		int t;

		if (a > b) { t=a; a=b; b=t;}
		if (a > c) { t=a; a=c; c=t;}
		if (b > c) { t=b; b=c; c=t;}

		System.out.println("a: " + a );
		System.out.println("b: " + b );
		System.out.println("c: " + c );
	}
}