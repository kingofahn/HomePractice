package domain;

public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	public int money, deposit, withdraw;
	public String name, uid, pass, accountNo, accountType, createDate;
	
	public void setMoney(int money) {
		this.money=money;
	}
	public void setDeposit(int deposit) {
		this.deposit=deposit;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw=withdraw;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setUid(String uid) {
		this.uid=uid;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	public void setCreateDate(String createDate) {
		this.createDate=createDate;
	}
}
