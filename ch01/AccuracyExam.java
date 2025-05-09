package ch01;

public class AccuracyExam {

	public static void main(String[] args) {
		
		int apple = 1 ;
		double pieceUnit = 0.1 ;
		int number = 5 ;
		
		double result = apple - number*pieceUnit ;
		System.out.println("사과 5조각을 뺌 :" + result);
		
		System.out.println("5조각의 값 :" + number * pieceUnit);

	}

}
