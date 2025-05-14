package ch02;

import java.util.Scanner;

public class RandomExam {

	public static void main(String[] args) {
	
	Scanner inputint = new Scanner(System.in);
	Scanner inputStr = new Scanner(System.in);
	
	System.out.println("주사위 게임 참여자는 몇 명인가요?");
	System.out.print(">>>");
	String dice = inputint.next();
	
	System.out.println("주사위를 굴리시겠습니까?");
	String yes = inputStr.next();
	
	
		System.out.println("주사위 굴리는 중...");
		
	
	
	int num = (int)(Math.random()*6) + 1 ;
	
	switch(num) {
	case 1 :
		System.out.println("주사위가 1이 나왔습니다.");
		break;
	case 2 :
		System.out.println("주사위가 2가 나왔습니다.");
		break;
	case 3 : 
		System.out.println("주사위가 3이 나왔습니다.");
		break;
	case 4 :
		System.out.println("주사위가 4가 나왔습니다.");
		break;
	case 5 :
		System.out.println("주사위가 5가 나왔습니다.");
		break;
	case 6 :
		System.out.println("주사위가 6이 나왔습니다.");
		break;
		
	}

	}

}
