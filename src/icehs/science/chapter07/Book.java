package icehs.science.chapter07;

public class Book {
	String title;
	String author;
	int price;
	Book() {
	
	}
	
	Book(String title , int price){
		this.title = title;
		this.price = price;
	}
	
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	Book(String title, String authoer) {
		this.title = title;
		this.author = author;
		this.price = price;
		
	}


	void printBookInfo() {
		System.out.println("Ã¥ Á¦¸ñ :" + this.title);
		System.out.println("ÀÛ°¡¸í : + this.author");
		System.out.println("°¡°Ý :" + this.price);
		
	}
}