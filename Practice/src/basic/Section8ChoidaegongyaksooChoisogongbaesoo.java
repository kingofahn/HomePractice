package basic;

public class Section8ChoidaegongyaksooChoisogongbaesoo {
	public static void main(String[] args) {
		int X = 80, Y=350;
		if(X < Y) {
			int TEMP = X;
			X = Y;
			Y = TEMP;
		}
		for(;;) {
			int M = X % Y;
			if(M==0)
				break;
			X = Y;
			Y = M;
		}
		System.out.println("최대공약수는 " + Y);
	}

}
