package icehs.science.chapter06;

public class InsranceHelpEx {
	
	public static void main(String[] args) {
		Account account = new Account();
		
		int balanceAfterDeposit = account.deposit(10000);
		System.out.println(balanceAfterDeposit);
		
		Account account2 = new Account();
		int balance =account2.getBalance();
		System.out.println(balance);
	}

}
