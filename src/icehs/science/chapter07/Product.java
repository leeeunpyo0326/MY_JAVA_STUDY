package icehs.science.chapter07;

public class Product {
	String name;
	int price;
	int discount;
	
	product(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	product(String name, int price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	void printPriductInfo() {
		System.out.println("=====" + this.name +"=====");;
		System.out.println("����" + this.price);
	}else {
		System.out.println("������ :" + this.discount);
	}
}
