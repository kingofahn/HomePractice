package basic;
public class Section3SumAvg {
	public static void main(String[] args) {
		double T[] = {184,240,9,235,333,295,20,38,329,34,350,59,313,24,187,327,334,234,59,234,47,145,95,282,148,213,182,283,227,156,217};
		double SUM = 0;
		int N = 0;
		int i = 0;
		while(true) {
			if(T[i] > 200) {
				SUM = SUM + T[i];
				N++;
			}
			i++;
			if(i>=10) break;
		}
		double AVG = SUM/N;
		System.out.println(AVG);
	}
}
