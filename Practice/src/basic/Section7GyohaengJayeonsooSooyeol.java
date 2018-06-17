package basic;

public class Section7GyohaengJayeonsooSooyeol {
	public static void main(String[] args) {
		int N=0, S=0;
		do {
			N += 1;
			S = S + N;
			N += 1;
			S = S - N;
		}while(N<101);
			System.out.println(S);
		}
}
