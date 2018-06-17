package basic;

import java.util.Scanner;

public class Seq012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.ODD 2.ADD");
			switch (sc.nextInt()) {
			case 1:
				String result = "";
				int max = 0, min = 0, sum = 0, oddSum = 0;
				System.out.println("Insert no.1");
				int num1 = sc.nextInt();
				System.out.println("Insert no.1");
				int num2 = sc.nextInt();

				max = num1 > num2 ? num1 : num2;
				min = num1 > num2 ? num2 : num1;

				for (int i = min; i <= max; i++) {
					if (i % 2 != 0) {
						sum = i++;
					}
				}
				oddSum = sum;
				sum = 0;

				for (int i = min; i <= max; i++) {
					if (i % 2 != 0) {
						sum += i;
						result += (i == oddSum) ? i + "=" : i + "+";
					}
				}
				System.out.println(result + sum);
				break;
			case 2:
				String result1 = "";
				int max1 = 0, min1 = 0, sum1 = 0, evenSum = 0;
				System.out.println("Insert no.1");
				int num3 = sc.nextInt();
				System.out.println("Insert no.1");
				int num4 = sc.nextInt();

				max1 = num3 > num4 ? num3 : num4;
				min1 = num3 > num4 ? num4 : num3;

				for (int i = min1; i <= max1; i++) {
					if (i % 2 != 0) {
						sum1 = i++;
					}
				}
				evenSum = sum1;
				sum1 = 0;

				for (int i = min1; i <= max1; i++) {
					if (i % 2 != 0) {
						sum1 += i;
						result1 += (i == evenSum) ? i + "=" : i + "+";
					}
				}
				System.out.println(result1 + sum1);

				break;
			default:
				System.out.println("Error");
				break;

			}
		}
	}
}
