package icehs.science.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student [] stu = {
				new Student("강감찬", "STU0001", "010-1234-5678"),
				new Student("이순신", "STU0002", "010-2234-5678"),
				new Student("김유신", "STU0003", "010-12534-5678"),
		};
		
		for(int i = 0; i < stu.length ; i++) {
			System.out.println(Stu[i].getName() + "(" + stu[i].getStuId() +") / 전화번호 : ");
		}
	

	}

}
