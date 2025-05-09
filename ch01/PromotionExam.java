package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		
		byte byteValue = 10 ;
		int intValue = byteValue ; 
		
		System.out.println("자동타입 된 int : " + intValue);
		
		char charValue = '가' ;
		intValue = charValue ;
		System.out.println("자동타입 된 int : " + intValue);
		
		intValue = 500 ;
		long longValue = intValue ;
		System.out.println("자동타입 된 long : " + longValue );
		
		double doubleValue = intValue ;
		System.out.println("자동타입 된 double : " + doubleValue);
	}

}
