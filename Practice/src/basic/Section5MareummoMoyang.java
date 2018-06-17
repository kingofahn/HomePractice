package basic;

public class Section5MareummoMoyang {
	public static void main(String[] args) {
		int A[][] = new int[5][5];
		int V = 1;
		int M = 2;
		int CL = M, CR = M;
				
		for(int R=0; R <= 4; R++) {
			for(int C = CL; C <= CR; C++) {
				A[R][C] = V;
				V = V + 2;
			}
			if(R < M) {
				CL--;
				CR++;
			} else {
				CL++;
				CR--;
			}
		}
		for(int R = 0; R < 5; R++) {
			for(int C = 0; C < 5; C++)
				System.out.print(A[R][C] + "\t");
			System.out.println();
		}
	}
}		
