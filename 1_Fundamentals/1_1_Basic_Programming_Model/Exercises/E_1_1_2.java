/* 
Give the type and value fo each of the following expressions
	(1 + 2.236)/2
	1+2+3+4.0
	4.1 >= 4
	1+2+"3"

*/
public class E_1_1_2 {
	public static void main(String[] args) {
		double x = (1+2.236)/2;
		double y = 1+2+3+4.0;
		boolean b = 4.1 >= 4;
		String s = 1+2+"3";

		System.out.println(x);
		System.out.println(y);
		System.out.println(b);
		System.out.println(s);
	}
}

/*
$ java -cp . E_1_1_2
1.618
10.0
true
33

*/