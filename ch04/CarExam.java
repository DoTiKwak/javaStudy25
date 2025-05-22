package ch04;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 실행 프로그램
		
		Scanner input = new Scanner(System.in);
		int speed = 0;
		final int max = 350;
		final int min = 0;
		boolean run = true;
		System.out.println("===차량 정보 입력===");
		
		Car myCar = new Car();
		System.out.println("제조회사 : ");
		myCar.company = input.next();
		
		System.out.println("모델 명 : ");
		myCar.model = input.next();
		
		System.out.println("색상 : ");
		myCar.color = input.next();
		
		while(run) {
			System.out.println("A. 차량 정보확인");
			System.out.println("B. 차량 시동걸기");
			System.out.println("C. 차량 주행시작");
			System.out.println("D. 차량 주행종료");
			System.out.print(">>>");
			String select = input.next();
			switch(select) {
			case "A" :
				System.out.println("차량명 : " + myCar.company);
				System.out.println("모델명 : " + myCar.model);
				System.out.println("색상 : " + myCar.color);
				break;
			case "B" :
				System.out.println("차량에 시동이 걸렸습니다.");
				myCar.start();
				break;
			case "C" :
				System.out.println("어떤 동작을 실행하시겠습니까?");
				System.out.println("0. 시동 종료");
				System.out.println("1. 가속");
				System.out.println("2. 감속");
				System.out.print(">>>");
				
				int select1 = input.nextInt();
								
				switch(select1) {
				
				case 0 :
					System.out.println("시동을 종료합니다...");
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
				}// switch select1 종료
			
			} // switch select 종료
		} // while문 종료
		
		

	} // main 메서드 종료

} // class 종료
