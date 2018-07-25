package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student hong = new Student();
		hong.name = "홍길동";
		hong.stuID = "5001";
		hong.korean = 94;
		hong.english = 80;
		hong.math = 89;
		
		hong.printStudentInfo();
		hong.calculateAVG();
		
		System.out.println();
		System.out.println("* 학번을 변경합니다.");
		System.out.println();
		hong.changeStudentID("TU0001");
		hong.printStudentInfo();
		

	}

}
