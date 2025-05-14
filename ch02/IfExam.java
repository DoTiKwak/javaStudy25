package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		System.out.print(">>>");
		String name = input.nextLine();
		System.out.println("성적을 입력하세요.");
		System.out.print("국어 : ");
		int kor = input.nextInt();
		if ( kor < 0 || kor > 100) {
			System.out.println("다시 입력해주세요.");
		}
		
		System.out.print("수학 : ");
		int mat = input.nextInt();
		if ( mat < 0 || mat > 100) {
			System.out.println("다시 입력해주세요.");
		}
		
		System.out.print("영어 : ");
		int eng = input.nextInt();
		if ( eng < 0 || eng > 100) {
			System.out.println("다시 입력해주세요.");
		}
		
		System.out.print("과학 : " );
		int sci = input.nextInt();
		if ( sci < 0 || sci > 100) {
			System.out.println("다시 입력해주세요.");
		}

		int total = kor + mat + eng + sci;
		double avg = (double)total / 4;
		System.out.println("평균을 확인하시겠습니까?");
		String answer = input.next();
		if (answer.equalsIgnoreCase("네")) {
			System.out.println("평균 계산중...");
			System.out.println("평균은 : " + avg + "점입니다.");			
		} else {
			System.out.println("다시 입력해주세요.");
		}
		
		
	}

}
