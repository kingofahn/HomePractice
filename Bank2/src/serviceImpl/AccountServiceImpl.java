package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import domain.Account;
import domain.MinusAccount;
import service.AccountService;

public class AccountServiceImpl implements AccountService {
	Account[] list;
	int count;

	public AccountServiceImpl() {
		list = new Account[10000];
		count = 0;
	}

	@Override
	public Account createAccount(String name, String uid, String pass) {
		Account account = new Account();
		account.setName(name);
		account.setUid(uid);
		account.setPass(pass);
		account.setAccountNo(createAccountNo());
		account.setCreateDate(createDate());
		account.setAccountType(account.ACCOUNT_TYPE);
		return account;
	}

	@Override
	public MinusAccount createMinusAccount(String name, String uid, String pass) {
		MinusAccount minusAccount = new MinusAccount();
		minusAccount.setName(name);
		minusAccount.setUid(uid);
		minusAccount.setPass(pass);
		minusAccount.setAccountNo(createAccountNo());
		minusAccount.setCreateDate(createDate());
		minusAccount.setAccountType(minusAccount.ACCOUNT_TYPE);
		return minusAccount;
	}

	@Override
	public void addList(Account account) {
		list[count++] = account;
	}

	@Override
	public Account[] list() {
		return list;
	}

	@Override
	public String createAccountNo() {
		String accountNum = "";
		for (int i = 0; i < 3; i++) {
			accountNum += (i != 2) ? String.format("%03d", Integer.parseInt(createRandom(1, 999))) + "-"
					: String.format("%03d", Integer.parseInt(createRandom(1, 999))) + "";
		}
		return accountNum;
	}

	@Override
	public String createRandom(int start, int end) {
		return String.valueOf((int) (Math.random() * (end + 1)) + start);
	}

	@Override
	public String createDate() {
		return new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}

	@Override
	public String showResult(Account[] list) {
		String result = "";
		list = list();
		for (int i = 0; i < count; i++) {
			result += toString(list[i]) + "\n";
		}
		return result;
	}

	@Override
	public String toString(Account account) {
		return String.format("%s \n %s \n 계좌번호 : %s \n 이름 : %s \n 생성일 : %s \n 잔액 : %s 원 ", account.BANK_NAME,
				account.accountType, account.accountNo, account.name, account.createDate, account.money);
	}
}
