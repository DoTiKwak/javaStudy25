package ch02;

import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("귀하의 성함을 입력하세요.");
		System.out.print(">>>");
		String name = input.nextLine();
		System.out.println("주민등록번호를 입력하세요.");
		System.out.print("주민등록번호 : ");
		String ssn = input.next();
		
		char ssn2 = ssn.charAt(0); 
		int num = Character.getNumericValue(ssn2);
		char ssn3 = ssn.charAt(1); 
		int num2 = Character.getNumericValue(ssn3);
		char ssn4 = ssn.charAt(6); 
		int num3 = Character.getNumericValue(ssn4);
		
		if (num >=3) { 
			System.out.println("성인 인증이 완료되었습니다."); 
		}else if (num == 0 && num2 <= 6) { 
			System.out.println("성인 인증이 완료되었습니다.");  
		}else if (num < 3 && num3 < 3) { 
			System.out.println("성인 인증이 완료되었습니다.");  
		}else { 
			System.out.println("만 19세 이상 회원만 가입 가능합니다.");
		} 

		if (num3 % 2 == 0) { 
			System.out.println("여성회원입니다.");
		}else if (num3 % 2 == 1) { 
			System.out.println("남성회원입니다.");
		}else { 
			System.out.println("존재하지 않는 성별입니다.");
			System.out.println("주민등록번호를 다시 입력해주세요.");
		} 
		
	} 

} 
