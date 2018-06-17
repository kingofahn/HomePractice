package basic;
import java.util.Scanner;
public class ForPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("End : 0  Start : 1");
			switch(sc.nextInt()) {
			case 0 : System.out.println("End");return;
			case 1 :
				int sum = 0; String result ="";
				int max=0, min=0;
				System.out.println("Insert first number");
				int num1 = sc.nextInt();
				System.out.println("Insert second number");
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
						result +=  i + "=";
					}else{
						result +=  i + "+";
					}
				}
				System.out.println(result + sum);break;
			default : System.out.println("Error"); break;
			}
		}
	}
}
