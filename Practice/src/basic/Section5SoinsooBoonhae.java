package basic;

public class Section5SoinsooBoonhae {
	public static void main(String[] args) {
		int A[] = new int[20];
		int N = 5;
		int T = 0;
		int P = 2;
		do {
			if(N >=2) {
				for(;P<=N; P++) {
					if(N % P == 0)
						break;
				}
				A[T]=P;
				N = N/P;
				T++;
			}
			else
					return;
		}while(N!=1);
		if(T==1)
			System.out.print("소수");
		else{
				for(int J = 0; J < T-1; J++) {
					System.out.print(A[J]+"*");
				}
				System.out.println(A[T-1]);
		}
	}
}
