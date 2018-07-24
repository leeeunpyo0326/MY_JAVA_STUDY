package icehs.science.chapter04;

public class SalaryTest {
	public static void main(String[] args) {
		
		int monthlySalary = 1000000;
		int bonus = monthlySalary * 4 * 20 / 100;
		int monthlyTax = monthlySalary * 55 / 1000;
		int annualTax = monthlySalary * 12;
		int annualSalarty = monthlySalary * 12;
		System.out.println("¿¬ºÀ : " + annualSalarty + ", ¼¼ÈÄ ¿¬ºÀ :" + (annualSalarty - annualTax));
		System.out.println();
		
	}

}
