package basic;
import java.util.Scanner;
/**
 두 플레이어가 가위바위로를 해서 승리를 결정짓도록 출력
 */
public class RPSGame {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.End 1.Begin");
			switch(sc.nextInt()) {
				case 0 : System.out.println("종료합니다"); return;
				case 1 : 
					System.out.println("===== Rock(1) Scissor(2) Paper(3) ======");
					System.out.print("\t Player 1 Start > : ");
					int input1 = sc.nextInt();
					System.out.print("\t Player 2 Start > : ");
					int input2 = sc.nextInt();
					
					
					if((input1==1 && input2==2) || (input1==2 && input2==3) || (input1==3 && input2==1)){
					System.out	.print("======== Player 1 win!!! ========");
					} else if((input2==1 && input1==2) || (input2==2 && input1==3) || (input2==3 && input1==1)){
					System.out.println("======== Player 2 win!!! ========");
					} else{
					System.out.println("========== Draw!!!  ==========");
					}	
					break;
			}
		}
	}
}