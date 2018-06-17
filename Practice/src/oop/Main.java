package oop;

import oop.Lotto;
import javax.swing.JOptionPane;

enum Butt {
	EXIT, INPUT_LOTTO, OUTPUT_LOTTO
}

public class Main {
	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.INPUT_LOTTO, Butt.OUTPUT_LOTTO };
		String output ="";
		int [][] arr = new int[20][6];
		Lotto lotto = null; 

		int count = 0;
		while (true) {
			switch ((Butt) JOptionPane.showInputDialog(null, // frame
					"MAIN PAGE", // frame title
					"SELECT MENU", // ORDER
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
			)) {
			case EXIT:
				return;

			case INPUT_LOTTO:
				lotto = new Lotto(); 
				lotto.setCount(Integer.parseInt(JOptionPane.showInputDialog("Price")));
				lotto.setRandoms();
				break;
				
			case OUTPUT_LOTTO:
				arr=lotto.getRandoms();
				for(int i=0; i<lotto.getCount(); i++) {
					for(int j=0; j<6; j++) {
						output += arr[i][j] +"     ";
					}
					output += "\n";
				}
				JOptionPane.showMessageDialog(null, output);;
				break;
			}
		}
	}
}