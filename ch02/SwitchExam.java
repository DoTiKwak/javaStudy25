package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하세요.");
		System.out.print(">>>");
		String ssn = input.next();
		char gen = ssn.charAt(6);
		
		switch(gen) {
		case '1' : case '3' : case '5' : case '7' : // 주민번호 일곱번째 자리 1,3,5,7은 남자
			System.out.println("당신은 남자입니다.");
			break;
		case '2' : case '4' : case '6' : case '8' : // 주민번호 일곱번째 자리 2,4,6,8은 여자
			System.out.println("당신은 여자입니다.");
			break;
		default :
			System.out.println("등록되지 않은 주민등록번호입니다.");
			System.out.println("다시 작성해주세요.");
		} // switch문 종료
		switch(gen) {
		case '1' : case '2' : // 주민번호 일곱번째 자리 1,2는 20세기 출생 내국인
			System.out.println("당신은 20세기 출생입니다.");
			System.out.println("당신은 한국인입니다.");
		break;
		case '3' : case '4' : // 주민번호 일곱번째 자리 3,4는 21세기 출생 내국인
			System.out.println("당신은 21세기 출생입니다.");
			System.out.println("당신은 한국인입니다.");
		break;
		case '5' : case '6' : // 주민번호 일곱번째 자리 6,7은 20세기 출생 외국인
			System.out.println("당신은 20세기 출생입니다.");
			System.out.println("당신은 외국인입니다.");
		break;
		case '7' : case '8' : // 주민번호 일곱번째 자리 7,8은 21세기 출생 외국인
			System.out.println("당신은 21세기 출생입니다.");
			System.out.println("당신은 외국인입니다.");
		default : // 주민번호 일곱번째 자리 1~8 제외 숫자
			System.out.println("존재하지 않는 주민등록번호입니다.");
		} //switch문 종료
	
	} // 메인메서드 종료

} //class 종료
