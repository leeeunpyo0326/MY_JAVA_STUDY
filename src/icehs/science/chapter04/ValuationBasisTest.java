package icehs.science.chapter04;

public class ValuationBasisTest {
	public static void main(String [ ] args) {
		
		int grade1 = 10;
		int grade2 = 20;
		int grade3 = 40;
		int grade4 = 50;
		int grade5 = 80;
		
		double result = 0;
		result += grade1 * grade2 /2 * 0.6;
		result += (grade3 + grade4) /2 * 0.13;
		result += grade5 *0.27;
		
		System.out.println("평가 점수 :" + result);
		
		if (result >=95 && result <= 100) {
			System.out.println("special class입니다.");
		}
		else if (result >=90 && result < 95) {
			System.out.println("Gole class입니다.");
		}
		else if (result >=85 && result < 90) {
			System.out.println("Silver class입니다.");
		}
		else if (result >=80 && result < 85) {
			System.out.println("Bronze class입니다.");
		}
		else if (result < 80) {
			System.out.println("Member class입니다.");
		}
		
	}
}
