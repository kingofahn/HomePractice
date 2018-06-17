package basic;
public class Section5NooseungHwalyong {
	public static void main(String[] args) {
	int N = 1;
	int F = 1;
	int S = 1;
	while(true) {
		N = N + 1;
		F = F * N;
		S = S + F;
		if (N == 20) break;
	}
	System.out.println(S);
		
		
	
	}
	

}
