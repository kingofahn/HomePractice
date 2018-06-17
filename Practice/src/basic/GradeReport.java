package basic;
import java.util.Scanner;
public class GradeReport {
	public static boolean input(int param) {
		boolean result=true;
//		result=(param>=0 && param<=100) ? true : false ;
		return (param>=0 && param<=100);
	}
	
	public static String[] getGrade(String[] params) {
		String[] result = new String[10];
		result[0] = params[0];
		result[1] = params[1];
		switch((Integer.parseInt(params[1])/10)) {
		case 9 : result[2]="A" ;break;
		case 8 : result[2]="B" ;break;
		case 7 : result[2]="C" ;break;
		case 6 : result[2]="D" ;break;
		case 5 : result[2]="E" ;break;
		default :result[2]="F" ;break;
		}
		
		return result;
	}
	
	public static String[] getScore(String[] params){
		String [] result = new String[10];
		result[0] = String.valueOf(
				Integer.parseInt(params[0])+Integer.parseInt(params[1])+Integer.parseInt(params[2])+Integer.parseInt(params[3])+Integer.parseInt(params[4])); 
		result[1] = String.valueOf(Integer.parseInt(result[0])/5);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] subject = {"kor","eng","math","sceince","art"};
		System.out.println("Name?");
		String name = sc.next();
		String[] score = new String[10];
 		
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i] + " score? ");
			int temp = sc.nextInt();
			if(input(temp)) {
				score[i] = String.valueOf(temp);
			} else {
				i--;
			}
		}
		
		String str[] = getGrade(getScore(score));
		
		System.out.printf("| kor : %s |" +" eng : %s |"+ " math : %s |" + " sceince : %s |" + " art : %s |" +"\n",score[0],score[1],score[2],score[3],score[4]);
		System.out.printf("| sum : %s |" +" avg : %s |"+ " grade : %s | ",str[0],str[1],str[2]);
		
		
		/*String.valueOf(Integer.parseInt*/
	}

}
