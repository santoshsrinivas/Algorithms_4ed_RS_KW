/* 
Write a code fragment that prints true if the double variables x and y are both strictly between 0 and 1 and false otherwise
*/

public class E_1_1_5 {
	public static void main(String[] args) {
		// double x = 0.0;
		// double y = 1.0;
		double x = 0.1;
		double y = 0.9;

		if ( (x > 0.0) && (y < 1.0)) {
			System.out.println("true");
		} else {
			 System.out.println("false");
		}
	}
}

/* 
$ java -cp . E_1_1_5
false

$ java -cp . E_1_1_5
true
*/