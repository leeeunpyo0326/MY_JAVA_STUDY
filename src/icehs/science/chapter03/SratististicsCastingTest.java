package icehs.science.chapter03;

public class SratististicsCastingTest {
	public static void main(String [] args) {
		
		double lottoProbability = 0.00000025;
		long population = 6973738433L;
		
		int intlottoProbability = (int) lottoProbability;
		int intpopulation = (int) population;
		
		System.out.println("�ζǿ� ��÷�� Ȯ�� :" + lottoProbability);
		System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ :" + lottoProbability);
		System.out.println("�� ���� �α� :" + population);
		System.out.println("�� ��� �α� int ��ȯ :" + intpopulation);
		
		
		
	}

}
