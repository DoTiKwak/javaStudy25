package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		
		byte byteValue = 10 ; // 바이트타입의 변수에 10값을 넣음.
		int intValue = byteValue ; // 자동 타입변환됨.
		
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
