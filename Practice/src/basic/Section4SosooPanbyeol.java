package basic;

public class Section4SosooPanbyeol {
	public static void main(String[] args) {
		int P = 2;
		int N = 3;
		while(true) {
			double tmp = Math.sqrt(N);
			int M = (int) tmp;
			for(int i = 2; i<=M; i++) {
				int R = N % i;
				if(R == 0)
					break;
				if(i == M)
					P=N;
			}
			N++;
			if(N > 100) break;
		}
		System.out.print(P);
	}

}
