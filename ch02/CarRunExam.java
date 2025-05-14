package ch02;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기
		// create - 시동을 건다.
		// read - 계기판 정보 출력
		// update - 주행
		// delete - 시동 종료
		
	Scanner input = new Scanner(System.in);
	
	boolean run = true ;
	int speed = 0;
	final int max = 350;
	final int min = 0;
	
	System.out.println("벤틀리가 입고되었습니다.");
	System.out.println("시동을 켭니다.");
	System.out.println("현재 속도 : " + speed + "km/h");
	
	while(run) {
	System.out.println("======================");
	System.out.println("0. 시동 종료");
	System.out.println("1. 엑셀");
	System.out.println("2. 브레이크");
	System.out.println("3. 멀티미디어");
	System.out.println("4. 주유하기");
	System.out.println("======================");
	System.out.print("(0~4 숫자입력)>>>");

	
	int select = input.nextInt();
	
	switch(select) {
	
	case 0 :
		System.out.println("시동을 종료합니다.");
		run = false ;
		break;
		
	case 1 : 
		System.out.println("가속을 진행합니다.");
	speed +=50 ;
	if(speed >= max) {
	speed = max;
	} // if문 종료
	System.out.println("현재 속도 : " + speed + "km/h");
	break;
	
	case 2 :
		System.out.println("감속을 진행합니다.");
	speed -= 30 ;
	if(speed <= min) {
		speed = min;
		
	} // if문 종료
	System.out.println("현재 속도 : " + speed + "km/h");
	break;
	
	case 3 :
		System.out.println("멀티 미디어를 실행합니다.");
		break;
		
	case 4 :
		System.out.println("주유를 진행합니다.");
		break;
	
	} // switch문 종료

	} // while문 종료

} // main 메서드 종료
	
} // class 종료
