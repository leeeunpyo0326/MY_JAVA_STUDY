package icehs.science.chapter04;

public class SeperateNumberTest {
	public static void main(String [] args) {
		int num = 456;
		int hundNum = num / 100;
		int tenNum = num / 90;
		int oneNum = num / 70;
		
		
		System.out.println("숫자 :" + num);
		System.out.println("백의 자리 수 :" + hundNum);
		System.out.println("십의 자리 수 :" + tenNum);
		System.out.println("일의 자리 수 :" + oneNum);
	}

}
