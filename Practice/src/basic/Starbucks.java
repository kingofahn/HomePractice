package basic;
import javax.swing.JOptionPane;
public class Starbucks {
	
	public static int getCost(int i, int j) {
		int result=i*j;
		return result;
	}
	
	public static void main(String[] args) {
		int cost =0, totalCost=0;
		int price [] = {3500,3800,4100};
		while(true) {
			switch(JOptionPane.showInputDialog("|1.아메리카노:3500|2.카페라뗴:3800|3.카페모카:4100|4.정산|")) {
			case "1" :
				int cup=Integer.parseInt(JOptionPane.showInputDialog("몇 잔?"));
				totalCost +=getCost(cup,price[0]);
				break;
			case "2" :
				cup=Integer.parseInt(JOptionPane.showInputDialog("몇 잔?"));
				totalCost +=getCost(cup,price[1]);
				break;
			case "3" :
				cup=Integer.parseInt(JOptionPane.showInputDialog("몇 잔?"));
				totalCost +=getCost(cup,price[2]);
				break;
			case "4" :
				JOptionPane.showMessageDialog(null, "Total Price : "+totalCost);
				return;				
			}
		}
	}
}
