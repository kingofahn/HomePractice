package domain;

public class MinusAccount extends Account{
	public final static String ACCOUNT_TYPE="마이너스통장";
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}