/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */
package Pertemuan2;

public class Account {
	private int accountNumber;
	private int currentBalance;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	public Account() {
		
	}
	
	public Account(int a, int b) {
		this.accountNumber=a;
		this.currentBalance=b;
	}
	
	public void credit (int amt) {
		currentBalance = currentBalance + amt ;
	}
	public void debit (int amt) {
		int tempBalance = currentBalance - amt;
		if (tempBalance < 0) {
			int i = 1 / 0;
			System.out.println(i);
		}
	currentBalance = tempBalance;
	}
	
}
