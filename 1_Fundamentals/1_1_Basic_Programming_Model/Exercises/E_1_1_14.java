/* 
	Write a static maethod lg() taht takes an int value N as argument and returns the largest int not larger than the base-2 logarithm of N. Do not use Math

*/

/*
	logarithm of a number to a particular base is : to what value I raise the base to get the number
	for eg:  
		log 8 base 2 = 3
		log 16 base 2 = 4
		if N = 8 , the answer is 3
		if N = 10, the answer is 3
		if N = 17, the answer is 4
		so, start a number at  2 and keep on multiplying it till it greater than the N.
		how many times you have multiplied/raised it by 2 is the answer.
*/
public class E_1_1_14 {
	public static void main(String[] args) {
		System.out.println("enter a positive integer ");
		int N = StdIn.readInt();
		while (N<=0){
			System.out.println("enter a number greater than 0");
			N = StdIn.readInt();
		}
		int result=lg(N);		
		System.out.println("largest int not larger than the base-2 logarithm of " + N + " is : " + result );
	}

	static int lg(int X) {

		if (X == 1)
			return 0;

		int num=2;
		int count = 0;
		while(num <= X ) {
			num = num * 2;
			count++;
		}

		return count;
	}
}

/* 
$ java -cp ../../../stdlib.jar:. E_1_1_14
enter a positive integer
32
largest int not larger than the base-2 logarithm of 32 is : 5

$ java -cp ../../../stdlib.jar:. E_1_1_14
enter a positive integer
64
largest int not larger than the base-2 logarithm of 64 is : 6

$ java -cp ../../../stdlib.jar:. E_1_1_14
enter a positive integer
65
largest int not larger than the base-2 logarithm of 65 is : 6

 java -cp ../../../stdlib.jar:. E_1_1_14
enter a positive integer
0
enter a number greater than 0
-9
enter a number greater than 0
1
largest int not larger than the base-2 logarithm of 1 is : 0


*/