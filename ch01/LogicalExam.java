package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {


		
		String newid = "khc1997";
		String newpw =	"13579";
				
		Scanner input = new Scanner(System.in);
		
		System.out.print(" ID �� �Է��Ͻÿ� : ");
		String id = input.nextLine();
		System.out.println("�Է��Ͻ� id�� " + id + " �Դϴ�.");
		
		System.out.print(" �н����带 �Է��Ͻÿ� : ");
		String pw = input.nextLine();
		System.out.println("=======���� ���Դϴ�.========");
		
		if ( (newid.equals(id)) & newpw.equals(pw) ) {
			
			System.out.println("�α��� ����!!!");
		}else {
			System.out.println("id�� pw�� �ٸ��ϴ�.");
	}
		
		
		
				
	}

}
