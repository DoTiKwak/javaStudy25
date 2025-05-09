package ch01;

public class CompareExam {

	public static void main(String[] args) {
		
		int num1 = 10 ;
		int num2 = 10 ;
		boolean result1 = (num1 <= num2) ;
		
		System.out.println(result1);
		
		char char1 = '1' ;
		char char2 = 1 ;
		boolean result2 = (char1 == char2) ;
		System.out.println(result2);
	
		int v2 = 1 ; 
		double v3 = 1.0 ; 
		System.out.println(v2 == v3);
		
		
		double v4 = 0.1 ;
		float v5 = 0.1F ;
		System.out.println("============================");
		System.out.println(v4 == v5); 
		System.out.println((float)v4 == v5); 
		System.out.println(v4 == (double)v5); 
		
		System.out.println((int)(v4*10) == (int)(v5*10));
		System.out.println(v4); 
		System.out.println(v5); 

	}

}
