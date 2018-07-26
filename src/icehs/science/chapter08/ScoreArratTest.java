package icehs.science.chapter08;

public class ScoreArratTest {
	public static void main (String[] args) {
		int [] scores = new int [3];
		scores[0] = 93;
		scores[1] = 87;
		scores[2] = 90;
		
		int sum = 0;
		
		for(int i = 0; i < scores.length ; i++) {
			sum += scores[i];
		}
		
		double avg = (double)sum / Scores.length
		
		//double avg = (double) (scores[0]) + scores[1] + scores[2]) / 3;
		
		System.out.println("국어 :" + scores[0]);
		System.out.println("영어 :" + scores[1]);
		System.out.println("수학 :" + scores[2]);
		System.out.println("사회 :" + scores[3]);
		
		//System.out.println("평균 :" + avg);
	}

}
