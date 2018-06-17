package controller;

import javax.swing.JOptionPane;
import serviceImpl.*;
import service.*;

public class AccountController {
	enum AccountButt {
		EXIT, ACCOUNT, MINUS_ACCOUNT, LIST
	};

	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		while (true) {
			AccountButt select = (AccountButt) JOptionPane.showInputDialog(null, "BANK", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, new AccountButt[] { AccountButt.EXIT, AccountButt.ACCOUNT,
							AccountButt.MINUS_ACCOUNT, AccountButt.LIST },
					null);
			switch (select) {
			case EXIT:
				return;

			case ACCOUNT:
				service.addList(service.createAccount(JOptionPane.showInputDialog("Name?"),
						JOptionPane.showInputDialog("ID?"), JOptionPane.showInputDialog("Password?")));
				break;
			case MINUS_ACCOUNT:
				service.addList(service.createMinusAccount(JOptionPane.showInputDialog("Name?"),
						JOptionPane.showInputDialog("ID?"), JOptionPane.showInputDialog("Password?")));
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, service.showResult(service.list()));
				break;
			}
		}
	}
}