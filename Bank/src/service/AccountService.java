package service;
import domain.*;
public interface AccountService {
	public Account createAccount(String name, String uid,String pass);
	public MinusAccount createMinusAccount(String name, String uid,String pass);
	public void addList(Account account);
	public Account[] list();
	public String createAccountNum();
	public String createRandom(int start, int end);
	public String createDate();
	public String showResult(Account[] list);
	public String toString(Account account); 
}