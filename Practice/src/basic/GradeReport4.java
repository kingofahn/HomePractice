package basic;

import java.util.Scanner;

	public class GradeReport4 {
		public static boolean checkScore(String param) {
			boolean result = true;
			return result = (Integer.parseInt(param)) <= 100 && (Integer.parseInt(param)) >= 0;
		}

	public static String[] getTotal (String param[]){
		String result [] = new String[2]; 
		result[0]=String.valueOf(Integer.parseInt(param[0])+Integer.parseInt(param[1])+Integer.parseInt(param[2]));
		result[1]=String.valueOf(Integer.parseInt(result[0])/3);
		return result;
	}
	
	public static String getGrade(int param) {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subject = { "Kor", "Eng", "Math" };
		String[] score = new String[3];
		String[] grade = new String[4];
		int sum = 0, avg = 0;
		System.out.printf("name? \n");
		String name = sc.next();
		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s ?\n", subject[i]);
			score[i] = sc.next();
			if (checkScore(score[i])) {
				grade[i] = getGrade(Integer.parseInt(score[i]));
			} else {
				System.out.printf("%s : Error \n", subject[i]);
				i--;
			}
		}

		for (int i = 0; i < subject.length; i++) {
			sum += Integer.parseInt(score[i]);
		}
		
		String subTotal[] = getTotal(score);
		grade[3] = getGrade(Integer.parseInt(subTotal[1]));
		
		
		System.out.printf("%s : subtotal[0]\n",subTotal[0]);
		
		System.out.printf("|        %s's Score card      | \n",name);
		System.out.printf("| %s : %s | %s : %s | %s : %s | \n", subject[0], grade[0], subject[1], grade[1], subject[2] ,grade[2]);
		System.out.printf("| %s : %s | %s : %s | %s : %s | \n","Total",subTotal[0],"AVG",subTotal[1],"Grade",grade[3]);
		
	}
}