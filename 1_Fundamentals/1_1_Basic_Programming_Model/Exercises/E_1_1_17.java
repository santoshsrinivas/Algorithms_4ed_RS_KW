/* 
	Criticize the following recursive function : 
*/

public class E_1_1_17 {
	public static String exR2(int n){
		String s = exR2(n-3) + n + exR2(n-2) + n;
		if (n <= 0) return "";
		return s;
	}

	public static void main(String[] args) {
		exR2(3);
	}
}

/* 
The base case will never be reached. A call to exR(3) will result in calls to exR2(0), exR2(-3), exR2(-6) and so on until a StackOverflowError occurs.
$ java -cp ../../../stdlib.jar:. E_1_1_17
Exception in thread "main" java.lang.StackOverflowError
        at E_1_1_17.exR2(E_1_1_17.java:7)
        at E_1_1_17.exR2(E_1_1_17.java:7)
        at E_1_1_17.exR2(E_1_1_17.java:7)
        at E_1_1_17.exR2(E_1_1_17.java:7)
        at E_1_1_17.exR2(E_1_1_17.java:7)
        at E_1_1_17.exR2(E_1_1_17.java:7)
        at E_1_1_17.exR2(E_1_1_17.java:7)
		.
		.
		.	
*/
