package basic;
import java.util.Scanner;
/**
 * 두 플레이어가 가위바위로를 해서 승리를 결정짓도록 출력
 * ㅡ 
 * 
 */
public class RPSGame2 {
	public static String[] decision(String[] params) {
		String result[] = new String[3];
		if ((params[0].equals("가위") && params[1].equals("보")) 
				|| (params[0].equals("바위") && params[1].equals("가위"))
				|| (params[0].equals("보") && params[1].equals("바위"))) {
			result[0] = "\t======== Player 1 win!!! ========";
		} else if ((params[1].equals("가위") && params[0].equals("보"))
				|| (params[1].equals("바위") && params[0].equals("가위"))
				|| (params[1].equals("보") && params[0].equals("바위"))){
			result[0] = "\t======== Player 2 win!!! ========";
		} else {
			result[0] = "\t========== Draw!!! ==========";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("0.End 1.Begin");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("종료합니다");
				return;
			case 1:
				String[] result = new String[3];
				String[] arr = new String[3];
				System.out.println("===== Rock(가위) Scissor(바위) Paper(보) ======");
				System.out.print("\t Player 1 Start > : ");
				result[0] = sc.next();
				System.out.print("\t Player 2 Start > : ");
				result[1] = sc.next();

				arr = decision(result);
				System.out.println(arr[0]);

				// if((input1==1 && input2==2) || (input1==2 && input2==3) || (input1==3 &&
				// input2==1)){
				// System.out .print("======== Player 1 win!!! ========");
				// } else if((input2==1 && input1==2) || (input2==2 && input1==3) || (input2==3
				// && input1==1)){
				// System.out.println("======== Player 2 win!!! ========");
				// } else{
				// System.out.println("========== Draw!!! ==========");
				// }
				break;
			default:
				System.out.println("Error");
				return;

			}
		}
	}
}