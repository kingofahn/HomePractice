package basic;
public class Section7YaksooWanjeonsoo {
	public static void main(String[] args) {
		int TN = 0;
		for(int N =4; N<=500; N++) {
			int SUM = 0;
			int K = N / 2;
			for(int J = 1; J<=K; J++) {
				if(N % J ==0)
					SUM= SUM + J;
			}
			if(N!=SUM) {
				System.out.println("N = " + N);
				TN++;
			}
		}
		System.out.println("완전수의 개수는 " + TN);
	}

}
