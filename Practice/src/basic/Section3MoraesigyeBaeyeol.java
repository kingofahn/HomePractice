package basic;

public class Section3MoraesigyeBaeyeol {
	public static void main(String[] args) {
		int A[][] = new int[5][5];
		int V = 1;
		int M = 3;
		for (int R = 0; R < M; R++) {
			for (int C = R; C < (5 - R); C++) {
				A[R][C] = V;
				V++;
			}
		}
		
		for(int R = M; R <= 4; R++ ) {
			for(int C = (4 - R); C <= R; C++) {
				A[R][C] = V;
				V++;
			}
		}
		
		for(int R = 0; R < 5; R++) {
			for(int C = 0; C < 5; C++) 
				System.out.print(A[R][C] + "\t");
			System.out.println();
			
		}
	}

}
