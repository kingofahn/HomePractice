package basic;

public class Section1HaengwooseonYeolwooseon {
	public static void main(String[] args) {
		int A[][] = new int[5][5];
		int V = 0;
		int C = 0;
		do {
			int R = 0;
			do {
				V++;
				A[R][C] = V;
				R++;
			} while(R <=4);
			C = C + 1;
		} while(C<=4);
		
		for(int R=0; R<5; R++) {
			for(C=0; C<5; C++)
				System.out.print(A[R][C]+"\t");
			System.out.println();
		}
		
	}

}
