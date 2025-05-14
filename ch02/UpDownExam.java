package ch02;

import java.util.Scanner;

public class UpDownExam {

	public static void main(String[] args) {
		int input = 0, answer = 0 ;
		
		answer = (int)(Math.random()*100) +1; // 1~100까지의 랜덤정수를 넣는다.
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요");
			input = scanner.nextInt();
			
			if(input > answer ) {
				System.out.println("down");
			}else if (input < answer ) {
				System.out.println("up");
			}
		} while (input!=answer) ;
		System.out.println("정답입니다. " + answer);
		
		

	}

}
