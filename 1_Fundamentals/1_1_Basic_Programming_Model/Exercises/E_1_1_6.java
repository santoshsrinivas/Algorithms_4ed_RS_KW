class E_1_1_6 
{
	public static void main(String... args)
	{
		int f=0;
		int g=1;
		for(int i=0; i<=15; i++)
		{
			StdOut.println(f);
			f=f+g;
			g=f-g;
		}
	}
}

/* 
javac -cp ~/myProg/Algorithms_4ed_RS_KW/stdlib.jar:. E_1_1_6.java

-- Run 1 --
java -cp ~/myProg/Algorithms_4ed_RS_KW/stdlib.jar:. E_1_1_6
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610


Its fibonacci series
*/