package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		
		byte byteValue = 10 ; // ����ƮŸ���� ������ 10���� ����.
		int intValue = byteValue ; // �ڵ� Ÿ�Ժ�ȯ��.
		
		System.out.println("�ڵ�Ÿ�� �� int : " + intValue);
		
		char charValue = '��' ;
		intValue = charValue ;
		System.out.println("�ڵ�Ÿ�� �� int : " + intValue);
		
		
		intValue = 500 ;
		long longValue = intValue ;
		System.out.println("�ڵ�Ÿ�� �� long : " + longValue );
		
		
		double doubleValue = intValue ;
		System.out.println("�ڵ�Ÿ�� �� double : " + doubleValue);
		

	}

}
