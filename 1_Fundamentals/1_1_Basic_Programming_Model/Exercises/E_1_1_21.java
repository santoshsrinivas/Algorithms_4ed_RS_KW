/*
	Write a program that reads in lines from standard input with each line containing a name and two integers and then uses printf() to print a tablewith a column of the names, the integers, and the result of dividing the first by the second, accurate to three decimal places. You could use a program like this to tabulate batting averages for baseball players or grades for students;
*/
public class E_1_1_21 {
	public static void main(String[] args) {
		String name;
		int first;
		int second;
		while(!StdIn.isEmpty()) {
			name = StdIn.readString();
			first = StdIn.readInt();
			second = StdIn.readInt();

			StdOut.printf("%s %d %d %.3f\n",name,first,second,(double)first/(double)second);	
		}
	}
}

/*

$ java -cp ../../../stdlib.jar:. E_1_1_21 < E_1_1_21_input.txt
santosh 10 15 0.667
srinivas 14 13 1.077
prasu 45 15 3.000
varu 87 9 9.667

*/