package basic;

public class Diagonal {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int i = 0;  // 행
        int j = 0;  // 렬
        int k = 0;  // 값
        
        for (int a = 0; a <= 8; a++) {
            if (a <= 4) {				 // 5번 동앙만 아래 for문 실행
                i = 0;					// 행이 아래 for구문 진행되는 동안 계속 0으로 초기화
                j = a;					// 렬은 횟수 a 와 비례하여 증가하기 때문에 a와 연동
                for (int s = 0; s <= a; s++) { // a 횟수 만큼만 반복시킴 
                    k++;                         //값을 1씩 증가
                    mtx[i][j] = k;               // i=0일때 j=0 k
                    i++;						// i증가
                    j--;						
                }
            } 
            else {
                i = a - 4;
                j = 4;
                for (int t = 8 - a; t >= 0; t--) {
                    k++;
                    mtx[i][j] = k;
                    i++;
                    j--;
                }
            }
        }
        for (int y = 0; y <= 4; y++) {
            for (int u = 0; u <= 4; u++) {
                System.out.printf("%d\t",mtx[y][u]);
            }
            System.out.println();
        }
    }
}