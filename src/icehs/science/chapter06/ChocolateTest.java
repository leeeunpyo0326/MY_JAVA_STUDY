package icehs.science.chapter06;

public class ChocolateTest {
	
	public static void main (String [] args) {
		
		Chocolate [] choco = {
		
		choco[0] = new Chocolate = ("아마도라", "다크",2200);
		choco[1] = new Chocolate = ("카페 키리쉬", "다크", 2500);
		choco[2] = new Chocolate = ("트리플 블랑", "화이트", 2300);
		};
		int sum = 0;
		for (int i = 0; i < choco.length : i++) {
			if(choco[i]).getType().equals("화이트")) {
				sum += choco[i].getPrice() * 80 / 100;
			}else {
				sum += choco[i].getPrice();
			}
			
			System.out.println("이름 :" + choco[i].getName() +", 종류 : " + choco[i].getType);
		}
		System.out.println();
		
	}

}
