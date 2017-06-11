/* 
Write a code fragment that prints the contents of a two-dimensional boolean array, using * to represent true and a space to represent false. Include row and column numbers.
*/

public class E_1_1_11 {
	public static void main(String[] args) {
		boolean b[][] = {
			{true,false,true},
			{false,true,true},
			{true,true,true}
		};

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(b[i][j] == true)
					System.out.println("("+i+","+j+")" + " : *");
				else
					System.out.println("("+i+","+j+")" + " :  ");
			}
		}
	}
}

/* 
$ java -cp . E_1_1_11
(0,0) : *
(0,1) :
(0,2) : *
(1,0) :
(1,1) : *
(1,2) : *
(2,0) : *
(2,1) : *
(2,2) : *

*/