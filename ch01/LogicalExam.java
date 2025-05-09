package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {


		
		String newid = "khc1997";
		String newpw =	"13579";
				
		Scanner input = new Scanner(System.in);
		
		System.out.print(" ID 를 입력하시오 : ");
		String id = input.nextLine();
		System.out.println("입력하신 id는 " + id + " 입니다.");
		
		System.out.print(" 패스워드를 입력하시오 : ");
		String pw = input.nextLine();
		System.out.println("=======접속 중입니다.========");
		
		if ( (newid.equals(id)) & newpw.equals(pw) ) {
			
			System.out.println("로그인 성공!!!");
		}else {
			System.out.println("id나 pw가 다릅니다.");
	}
		
		
		
				
	}

}
