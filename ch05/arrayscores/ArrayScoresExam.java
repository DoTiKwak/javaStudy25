package ch05.arrayscores;

import java.util.Scanner;

public class ArrayScoresExam {

	public static void main(String[] args) {
		// 성적표
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		System.out.println("======성적표======");
		System.out.println("학생수를 입력하세요 : ");
		System.out.print(">>>");
		
		int count = inputInt.nextInt();

		int[] scores = new int[count]; // 키보드로 입력받은 값을 토대로 배열길이 생성 
		System.out.println("배열의 길이 : " + scores.length);

		for(int i=0 ; i<scores.length ; i++) {  // scores.length(배열길이)
		System.out.println( (i + 1) +"번째 학생의 점수를 입력하세요");
		scores[i] = inputInt.nextInt();
		}
		
		System.out.println("==========입력된 점수 확인===========");
		for(int i=0 ; i<scores.length ; i++) {
		System.out.print(scores[i] + " "); // 점수 점수 점수 .......
		}
		
		System.out.println();
		System.out.println("=========수정할 번호 입력=========");
		int select = inputInt.nextInt();
		System.out.println("=========수정할 점수 입력=========");
		int score = inputInt.nextInt(); 

		scores[select-1] = score ;
		System.out.println("수정한 결과 확인");
		System.out.println(select + "번의 점수는 : " + score + "로 수정 완료!!!");

		int sum = total(scores);
		System.out.println("총점 : " + sum + "점 입니다. ");

		double ave = average(sum, count);
		System.out.println("평균 : " + ave + "점 입니다. ");


		} // main()메서드 종료

		static double average(int sum, int count ) {
		double ave = 0 ; 
		ave = sum / count ;
		return ave ;
		}

		static int total(int[] scores) {
		int sum = 0 ; 
		for(int i = 0 ; i<scores.length ; i++) {
		sum += scores[i]; // scores의 모든 값을 sum에 누적
		} // scores 배열의 값을 모두 가져옴 

		return sum ; 
		} // scores 배열을 받아 int로 리턴

		 // main 메서드 종료

} // class 종료
