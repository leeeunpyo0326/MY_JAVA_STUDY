package icehs.science.chapter04;

public class GradeIfElseIfTest {
	
	int a = 92;
	
	if (a >= 90 && a <= 100) {
    System.out.println("A학점 입니다.");
}
	if (a >= 80 && a < 90) {
	    System.out.println("B학점 입니다.");
	}
	if (a >= 70 && a < 80) {
	    System.out.println("C학점 입니다.");
	}
	if (a >= 60 && a < 70) {
	    System.out.println("D학점 입니다.");
	}
	if (a < 60) {
	    System.out.println("F학점 입니다.");
	}
}
}
