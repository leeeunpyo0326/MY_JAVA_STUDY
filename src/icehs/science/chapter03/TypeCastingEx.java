package icehs.science.chapter03;

public class TypeCastingEx {
	public static void main(String[] args) {
		long billWealth = 7000000000L;
		System.out.println("Original :" +billWealth);
		
		double doublebillWealth = billWealth;
		System.out.println("double������ ��ȯ :" +doublebillWealth);
		
		int inBillWealth = (int) billWealth;
		System.out.println("int������ ���� ��ȯ : " + inBillWealth);
	}
}
