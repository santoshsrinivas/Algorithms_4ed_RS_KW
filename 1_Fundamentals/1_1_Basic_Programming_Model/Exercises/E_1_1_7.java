/* 
Give the value printed by each of the following code fragments 

*/

public class E_1_1_7 {
	public static void main(String[] args) {
		double t = 9.0;
		while(Math.abs( t - 9.0/t) > .001)
			t = (9.0/t + t)/2.0;
		StdOut.printf("%5f\n",t);

		int sum = 0;
		for (int i=1; i< 1000; i++) 
			for ( int j=0; j <i; j++)
				sum++;
		StdOut.println(sum);

		int sum1=0;
		for(int i=1; i<1000; i*=2)
			for(int j=0;j<1000;j++)
				sum1++;
		StdOut.println(sum1);
	}
}

/*
$ javac -cp ../../../stdlib.jar E_1_1_7.java
$ java -cp ../../../stdlib.jar:. E_1_1_7
3.000092
499500
10000

*/
