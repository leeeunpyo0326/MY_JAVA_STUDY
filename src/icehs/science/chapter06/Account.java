package icehs.science.chapter06;

public class Account {
	String accName;
	String accNo;
	int balance;
	
	void deposit(int money) {
		if (money < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
		}else {
		balance += money;
	 }
	}
	
	void withdraw(int money) {
		if (money < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
		}else if (money > balance) {
			System.out.println("[에러] 잔액이 부족합니다.");
		}else {
			balance -= money;
		}	
	}
	void printAccountInfo() {
		
		System.out.println("계좌 :" + accNo + "(예금주 :" + accName +")");
		System.out.println("잔액 : "+ balance +" 원 ");
	}
}