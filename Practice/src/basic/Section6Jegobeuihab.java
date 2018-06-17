package basic;

public class Section6Jegobeuihab {
	public static void main(String[] args) {
		int A=0, B=0,C=0,S=0;
		
		do {
		A = A + 1;
		B = 101 - A;
		C = A * B;
		C = C * C;
		S = S + C;
		}while( A < 100);
		
		System.out.println(S);
	}

}
