package basic;

import java.util.Scanner;

public class Hello1 {
	public static void main(String[] args) {
		System.out.print("이름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.print("반갑습니다! " + name + "님");
	}
}
