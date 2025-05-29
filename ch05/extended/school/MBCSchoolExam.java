package ch05.extended.school;

import java.util.Scanner;

public class MBCSchoolExam {

	public static void main(String[] args) {
		
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		Teacher teacher = new Teacher();
		
		System.out.print("교직원 번호를 입력하세요. : ");
		teacher.setTeachID(inputStr.next());
		
		System.out.print("담당 학년을 입력하세요 : ");
		teacher.setGrade(inputInt.nextInt());
		
		System.out.print("담당 교실을 입력하세요 : ");
		teacher.setRoom(inputInt.nextInt());
		
		System.out.print("담당 학생수를 입력하세요 : ");
		teacher.setStcount(inputInt.nextInt());
		
		System.out.print("선생님 이름을 입력하세요.");
		teacher.setName(inputStr.next());
		
		System.out.println("선생님의 키를 입력하세요.");
		teacher.setHeight(inputInt.nextInt());
		
		System.out.println("선생님의 몸무게를 입력하세요.");
		teacher.setWeight(inputInt.nextInt());
		
		System.out.println("선생님의 나이를 입력하세요.");
		teacher.setAge(inputInt.nextInt());
		
		System.out.println("입력된 선생님의 정보입니다. " + teacher);
		System.out.println("=================================");
		

	}

}
