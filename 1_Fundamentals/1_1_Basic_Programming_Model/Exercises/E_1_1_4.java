/* 
what if anything is wrong with each of the following statements? 

a. if (a>b) then c=0;
b. if a>b { c = 0; }
c. if (a>b) c=0;
d. if (a>b) c=0 else b=0;

*/

public class E_1_1_4 {
	public static void main(String[] args) {
		int a = 7;
		int b = 4;
		int c = 5;

		// if (a>b) then c=0;
		// if a > b { c=0; }
		// if ( a > b ) c = 0;
		if ( a > b ) c = 0 else b = 0;

		System.out.println("a: " + a + " , b: " + b + " ,c: " + c);
	}
}

/*
a. "then" is not a java keyword
b.  a > b should be wrapped in parantheses
c.  OK
d.  semi-colon needed at the end of c = 0;

*/