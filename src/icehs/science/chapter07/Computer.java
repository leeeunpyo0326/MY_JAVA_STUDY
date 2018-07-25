package icehs.science.chapter07;

public class Computer {
	String mode1;
	String osVer;
	int production;
	int salse;
	
	public Computer(String mode1, String osVer, int production) {
		super();
		this.mode1 = mode1;
		this.osVer = osVer;
		this.production = production;
	}
	public Computer(String mode1, String osVer, int production, int salse) {
		super();
		this.mode1 = mode1;
		this.osVer = osVer;
		this.production = production;
		this.salse = salse;
	}
	
	void printComputerInfo() {
		System.out.println("===" + this.mode1);
	}
	
	

}
