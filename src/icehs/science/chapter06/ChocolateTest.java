package icehs.science.chapter06;

public class ChocolateTest {
	
	public static void main (String [] args) {
		Chocolate choco = new Chocolate();
		choco.name = "���̵���";
		choco.type = "��ũ";
		choco.price = 2200;
		
		choco.printChocolateInfo();
		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrince(20);
		
		System.out.println(chocoName + "���ڷ� 20��" + totalPrice + "��");
		
		choco.changeCholateInfo("ī�� Ű����", 2500);
		chocoName = choco.getName();
		totalPrice = choco.calculareTotalPrice(15, 10);
		System.out.println(chocoName + "���ݷ� 15��(10%)����) :" + totalPrice);
		choco.changeChocolateInfo("Ʈ���� ���", "ȭ��Ʈ",2300);
	}

}
