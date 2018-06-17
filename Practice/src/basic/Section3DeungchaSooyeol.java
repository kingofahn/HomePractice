package basic;
public class Section3DeungchaSooyeol {
	public static void main(String[] args) {
		int A=2, D=6, S=2, N=2, AN = 0;
		while(true) {
			AN = A + (N-1) * D;
			S += AN;
			N += 1;
			if(N>200) break;
		}
		System.out.println(S);	
		
		
	}

}
