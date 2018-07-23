package icehs.science.chapter03;

public class SratististicsCastingTest {
	public static void main(String [] args) {
		
		double lottoProbability = 0.00000025;
		long population = 6973738433L;
		
		int intlottoProbability = (int) lottoProbability;
		int intpopulation = (int) population;
		
		System.out.println("로또에 당첨될 확률 :" + lottoProbability);
		System.out.println("로또에 당첨될 확률 int 변환 :" + lottoProbability);
		System.out.println("전 세계 인구 :" + population);
		System.out.println("전 사계 인구 int 변환 :" + intpopulation);
		
		
		
	}

}
