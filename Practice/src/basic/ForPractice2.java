package basic;
import java.util.Scanner;
public class ForPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0. End  1.Start");
			switch(sc.nextInt()) {
			case 0 : System.out.println("The end"); return;
			case 1 :
				String result = ""; 
				int sum = 0, max = 0, min = 0;
				System.out.println("Insert first number");
				int num1 = sc.nextInt();
				System.out.println("Insert first number");
				int num2 = sc.nextInt();
				
				if(num1>num2) {
					max = num1;
					min = num2;
				} else {
					max = num2;
					min = num1;	
				}
				
				for(int i=min; i<=max; i++) {
					sum += i;
					if(i==max) {
						result += i + "=";
					} else {
						result += i + "+";
					}
					System.out.println(result + sum);
				}
				break;
			default : System.out.println("Error"); break;
			}
		}
	}
}
