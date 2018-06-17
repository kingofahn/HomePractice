package basic;

import java.util.Scanner;

public class GradeReport2 {
	public static String subGrade(int param) {
		String result = "";
		switch (param / 10) {
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		default:
			result = "F";
			break;
		}
		return result;
	}
	
	public static boolean scoreCheck(int param) {
		boolean result = true ;
		return (param<=100 && param>=0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] subGrade = new String[4];
		String [] subject = {"math","eng","kor"};
		int temp = 0;
		int [] score = new int[3];

		System.out.println("name?");
		String name = sc.next();
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i] + "?");
			temp = sc.nextInt();
			if(scoreCheck(temp)) {
				subGrade[i] = subGrade(temp);
				score[i]=temp;				
			} else {
				System.out.printf("%s 입력 오류\n",subject[i]);
				i--;
			}
		}
		
		int total = score[0] + score[1] + score[2];
		int avg = (total / score.length);
		subGrade[3]= subGrade(avg);

		System.out.printf("name: %s\t math: %s\t eng: %s \t kor: %s\t\n", name, subGrade[0], subGrade[1], subGrade[2]);
		System.out.printf("total: %d\t avg: %s\t grade: %s", total, avg, subGrade[3]);

	}
}
