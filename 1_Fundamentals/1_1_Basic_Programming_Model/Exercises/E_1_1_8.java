/* 
What to each of the following print?
a. System.out.println('b');
b. System.out.println('b' + 'c');
c. System.out.println((char) ('a' + 4));

*/

public class E_1_1_8 {
	public static void main(String[] args) {
		
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));

	}
}

/*
$ java -cp . E_1_1_8
b
197
e

a. 'b' is a char which will printed as it is.
b. The result of adding Java chars, shorts, or bytes is an int. https://stackoverflow.com/questions/8688668/in-java-is-the-result-of-the-addition-of-two-chars-an-int-or-a-char
c. Converting an int to char is a narrowing conversion and 'A' + 1 is a constant expression. A constant expression is (basically) an expression whose result is always the same and can be determined by the compiler. Narrowing conversions are permitted for assignments of byte, short and char when it's a constant expression. https://stackoverflow.com/questions/21317631/java-char-int-conversions
typecasting an int to char

*/