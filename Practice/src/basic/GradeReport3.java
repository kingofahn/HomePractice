package basic;

import java.util.Scanner;

public class GradeReport3 {

	public static boolean checkScore(int temp) {
		boolean result = true;
		result=(temp >= 0 && temp <= 100);
		return result;
	}

	public static String gradeCheck(int temp) {
		String result = "";
		switch (temp/10) {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subject = {"Kor","Eng","Math"};
		System.out.printf("subject.length = %d\n", subject.length);
		
		String[] grade = new String[4];
		int[] score = new int[3];
		int sum = 0, avg = 0;
		System.out.printf("Name?\n");
		String name = sc.next();
		for (int i = 0; i < subject.length; i++) {
			System.out.printf(subject[i] + "? \n");
			int temp = sc.nextInt();
			if (checkScore(temp)) {
				score[i] = temp;
				grade[i] = gradeCheck(temp);
			} else {
				System.out.printf("%s : Error \n", subject[i]);
				i--;
			}
		}

		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
			if (i == score.length - 1) {
				avg = sum / score.length;
			}
		}
		System.out.println("__________________________________________");
		System.out.printf("\t %s's Score card\n",name);
		System.out.println("------------------------------------------");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("\t| %s | %d | %s |\n", subject[i], score[i], grade[i]);
			System.out.println("------------------------------------------");
		}
		System.out.printf("\t| Total | %d |\n",sum);
		System.out.println("------------------------------------------");
		System.out.printf("\t| Avg | %d |\n",avg);
		System.out.println("------------------------------------------");
		System.out.printf("\t| Grade | %s |\n",gradeCheck(avg));
		System.out.println("__________________________________________");
	}
}