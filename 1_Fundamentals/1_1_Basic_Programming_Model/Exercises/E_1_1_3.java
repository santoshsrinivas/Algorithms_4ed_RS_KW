/*
Write a program that takes three integer command-line arguments and prints
equal if all three are equal, and not equal otherwise.
*/

public class E_1_1_3 {
	public static void main(String... args)
	{
		if (args.length != 3)
		{
			StdOut.println("Enter 3 integers as arguments");
			System.exit(1);
		}

		int[] input = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};


		if ((input[0] == input[1]) && (input[1] == input[2]))
			StdOut.println("equal");
		else 
			StdOut.println("not equal");

	}
}

/* 
javac -cp ~/myProg/Algorithms_4ed_RS_KW/stdlib.jar:. E_1_1_3.java
-- Run 1 --
java -cp ~/myProg/Algorithms_4ed_RS_KW/stdlib.jar:. E_1_1_3 1 1 1
equal
--- Run 2 --
java -cp ~/myProg/Algorithms_4ed_RS_KW/stdlib.jar:. E_1_1_3 1 1 2
not equal
*/
