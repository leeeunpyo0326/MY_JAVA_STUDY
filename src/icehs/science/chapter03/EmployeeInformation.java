package icehs.science.chapter03;

public class EmployeeInformation {
	public static void main(String [] args) {
		String name = "ȫ�浿";
		String entranceYear = "2002";
		int thisYear = 2018;
		
		int employedDuration = thisYear - Integer.parseInt(entranceYear);
		
		System.out.println("�̸� :" + name);
		System.out.println("�Ի�⵵:" + entranceYear);
		System.out.println("�ٹ����:" + employedDuration);
		
	}

}
