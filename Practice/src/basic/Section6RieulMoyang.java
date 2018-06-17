package basic;
public class Section6RieulMoyang {
	public static void main(String[] args) {
		int A[][] = new int[5][5];
		int V = 1, D = 1;
		int C1 = 0, C2 = 4;
		
		for(int R=0; R < 5; R++) {
			for(int C = C1; C != C2 + D; C = C + D) {
				A[R][C] = V;
				V = V + 1;
			}
			int Temp = C1;
			C1 = C2;
			C2 = Temp;
			D = -D;
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
				System.out.print(A[i][j] + "\t");
			System.out.println();
		}
		
	}
}