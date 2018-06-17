package basic;
import javax.swing.JOptionPane;
public class RPSGame3 {

	public static void main(String[] args) {
		int win=0, lose=0, draw=0;
		while(true) {
			switch(JOptionPane.showInputDialog("1.시작 (계속) 2. 종료(결과보기)")) {
			case "1" : 
				int input1 = Integer.parseInt(JOptionPane.showInputDialog("1.가위 2.바위 3.보"));
				int input2 = ((int) Math.random()*3+1);
				switch(input1-input2){
				case -1 : case 2: JOptionPane.showMessageDialog(null,"Player win");
				win+=1;break;
				case 1 : case -2: JOptionPane.showMessageDialog(null, "Player lose");
				lose+=1;break;
				case 0: JOptionPane.showMessageDialog(null,"Draw");
				draw+=1;break;
				default :JOptionPane.showMessageDialog(null,"Error"); break;
				}break;
			case "2" :
				JOptionPane.showMessageDialog(null,"Result | Win : " + win + " | Lose : " + lose + " | Draw : "+draw);
				return;
			default :JOptionPane.showMessageDialog(null, "Error"); break;
			}
			
		}
	}
}
