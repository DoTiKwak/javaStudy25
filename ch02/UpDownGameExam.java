package ch02;

import java.util.Scanner;

public class UpDownGameExam {

	public static void main(String[] args) {
		// 업앤다운 게임 만들기
		// 컴퓨터가 랜덤 숫자 생성(1~100)
		// 사용자가 숫자를 입력하면 컴퓨터가 랜덤 숫자를 판단하여 up/down을 알려준다.
		// 사용자의 숫자와 컴퓨터의 랜덤숫자가 일치하면 프로그램 종료와 함께 당첨을 알린다.
		// 6번 안에 맞추면 상품을 제공합니다.
		
		int answer = (int)(Math.random()*100) + 1 ;
		Scanner input = new Scanner(System.in);
		int question = 0;
		int hits = 0;
		
		System.out.println("============================");
		System.out.println("UP&DOWN 게임에 오신 걸 환영합니다.");
		System.out.println("6번의 기회 안에 맞추면 상품을 드려요.");
		System.out.println("상품 제공은 관리자를 통해 전달됩니다.");
		System.out.println("============================");
		
		do {
			System.out.println("1부터 100 사이의 숫자를 입력하세요.");
			
			question = input.nextInt();
			hits ++ ;
			 if (question > answer) {
				 System.out.println("Down");
				 
			 }else if (question < answer) {
				 System.out.println("Up");
			 } // if문 종료
			 } // do 종료
				while(question != answer);
			 System.out.println("정답입니다." + answer);
			 System.out.println("정답까지 소요된 횟수는 : " + hits + "번입니다.");
			 
			 if(hits <= 6) {
				 System.out.println("상품 수령 : 관리자가 연락을 드립니다.");
				 
			 }else {
				 System.out.println("상품 수령 실패 : 재도전 기회는 없습니다.");
			 } // if문 종료
		
		
		

	} // main 메서드 종료

} // class 종료
