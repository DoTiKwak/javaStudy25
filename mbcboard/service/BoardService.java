package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.BoardDAO;
import mbcboard.dto.BoardDTO;

public class BoardService {
	
	public BoardDAO boardDAO = new BoardDAO();
	

	public void subMenu(Scanner inputStr) throws SQLException {
		
		boolean subRun = true;
		while(subRun) {
			System.out.println("MBC아카데미 게시판 서비스 입니다.");
			System.out.println("1. 모두보기");
			System.out.println("2. 게시글 작성");
			System.out.println("3. 게시글 자세히 보기");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 나가기");
			System.out.print(">>>");
			String subSelect = inputStr.next();
			
			switch(subSelect) {
			case "1" :
				System.out.println("모든 게시글 보기");
				selectAll(boardDAO);
				break;
			case "2" : 
				System.out.println("게시글 작성 메서드로 진입합니다.");
				insertBoard(boardDAO,inputStr);
				break;
			case "3" :
				System.out.println("게시글 자세히 보기");
				readOne(inputStr);
				break;
			case "4" :
				System.out.println("게시글 수정 메서드로 진입합니다.");
				modify(inputStr);
				break;
			case "5" :
				System.out.println("게시글 삭제 메서드로 진입합니다.");
				deleteOne();
				break;
			case "6" :
				System.out.println("게시글 보기 종료");
				boardDAO.connection.close();
				subRun = false;
				break;
			} // switch문 종료
			
		} // while문 종료
		
	} // 부메뉴 메서드 종료


	private void deleteOne() throws SQLException {
		
		System.out.println("삭제하려는 게시글의 번호를 입력하세요");
		Scanner inputInt = new Scanner(System.in);
		System.out.print(">>>");
		int selectBno = inputInt.nextInt();
		boardDAO.deleteOne(selectBno);
		
	}


	private void modify(Scanner inputStr) throws SQLException {
		
		System.out.println("수정하려는 게시글의 제목을 입력하세요");
		System.out.print(">>>");
		String title = inputStr.next();
		
		boardDAO.modify(title, inputStr);
		System.out.println("=======끝=======");
		
	}

	

	private void readOne(Scanner inputStr) throws SQLException {
		
		System.out.println("보고싶은 게시글의 제목을 입력하세요");
		System.out.print(">>>");
		String title = inputStr.next();
		
		boardDAO.readOne(title);
		System.out.println("=======끝=======");
		
	}


	private void insertBoard(BoardDAO boardDAO, Scanner inputStr) throws SQLException {
		
		BoardDTO boardDTO = new BoardDTO();
		System.out.print("작성자 : ");
		boardDTO.setBwriter(inputStr.next());
		
		System.out.print("제목 : ");
		boardDTO.setBtitle(inputStr.next());
		
		Scanner inputLine = new Scanner(System.in);
		System.out.print("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine());
		boardDAO.insertBoard(boardDTO);
		System.out.println("==========insertBoard메서드 종료==========");
		
	}


	private void selectAll(BoardDAO boardDAO) throws SQLException {
		
		System.out.println("=========================");
		System.out.println("====MBC 게시판 목록입니다====");
		boardDAO.selectAll();
		System.out.println("=========================");
		
	}

}
