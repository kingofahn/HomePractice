package basic;

public class Same {
	public static void main(String[] args) {
		String[] result = { "가위", "바위", "보", "가위" };
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		
		if(result[0]==result[1]) {
			System.out.println("0과 1 같음");
		} else {
			System.out.println("0과 1 다름");
		}
		
		if(result[0]==result[3]) {
			System.out.println("0과 1 같음");
		} else {
			System.out.println("0과 1 다름");
		}
		
		
		
	}
}