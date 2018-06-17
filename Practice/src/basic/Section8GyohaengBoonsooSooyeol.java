package basic;

public class Section8GyohaengBoonsooSooyeol {
	public static void main(String[] args) {
		int K = 0;
		double S = 0;
		int SW= 0;
		double L = 0;
		do {
				K = K + 1;
				L = (double)K/((K+1)*(K+2));
				if(SW == 0) {
					S = S + L;
					SW = 1;
				} else {
					S = S - L;
					SW = 0;
				}
						
		}while(K!=49);
		System.out.println(S);
		
	}

}
