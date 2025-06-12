package mbcboard;

import java.sql.SQLException;
import java.util.Scanner;


import mbcboard.service.BoardService;


public class BoardExam {
	
	public static Scanner inputStr = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		
		
		boolean run = true;
		
		while(run) {
			System.out.println("MBC 자유 게시판입니다.");
			System.out.println("1. 회원");
			System.out.println("2. 게시판");
			System.out.println("3. 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("회원용 서비스로 진입합니다.");
				
				break;
			case "2" :
				System.out.println("게시판 서비스로 진입합니다.");
				BoardService boardService = new BoardService();
				boardService.subMenu(inputStr);
				break;
			case "3" :
				System.out.println("자유게시판 프로그램 종료합니다.");
				run = false ;
				break;
			default :
				System.out.println("1~3까지만 입력 바랍니다.");
			} // switch 문 종료
			
			
		} // while문 종료
				
		
	} // main 메서드 종료

} // class 종료
