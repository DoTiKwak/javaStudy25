package ch01;

public class IntToFloatExam {

	public static void main(String[] args) {
		
		int num1 = 123456780 ;
		int num2 = 123456780 ;
		
		float num3 = num2 ; 
		num2 = (int) num3 ; 
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2); 
		System.out.println("num3 : " + num3); 
		
		
		int result = num1 - num2 ;
		System.out.println("float으로 변환 후에 num2 값 변경됨.");
		System.out.println("num1 - num2 : " + result);

	}

}
