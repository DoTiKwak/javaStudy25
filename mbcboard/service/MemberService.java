package mbcboard.service;

import java.io.InputStream;
import java.util.Scanner;

import mbcboard.dao.MemberDAO;
import mbcboard.dto.MemberDTO;

public class MemberService {

	Scanner inputStr = new Scanner(System.in);
	
	public MemberDAO memberDAO = new MemberDAO();
	
	public void LogMenu(Scanner inputStr) {
		boolean logRun = true;
		while(logRun) {
			System.out.println("MBC아카데미 회원관리 입니다.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. ID 찾기");
			System.out.println("4. PW 변경");
			System.out.println("5. 계정 삭제");
			System.out.println("6. 나가기");
			System.out.print(">>>");
			String logSelect = inputStr.next();
			
			switch(logSelect) {
			case "1" :
				System.out.println("회원가입 페이지로 진입합니다.");
				createAcc(memberDAO);
				break;
			case "2" : 
				System.out.println("로그인 페이지로 진입합니다.");
				logOn(memberDAO,inputStr);
				break;
			case "3" :
				System.out.println("ID 찾기 페이지로 진입합니다.");
				findId(inputStr);
				break;
			case "4" :
				System.out.println("PW 변경 페이지로 진입합니다.");
				changePw(inputStr);
				break;
			case "5" :
				System.out.println("계정 삭제 페이지로 진입합니다.");
				deleteAcc();
				break;
			case "6" :
				System.out.println("회원관리 종료");
				memberDAO.conn.close();
				logRun = false;
				break;
			} // switch문 종료
		}
	}

	private void createAcc(MemberDAO memberDAO) {
		
		System.out.println("MBC 회원가입 페이지입니다.");
		MemberDTO myAccount = new MemberDTO();
		System.out.println("생성할 ID를 입력하세요 : ");
		myAccount.setmID(inputStr.next());
		System.out.println("생성할 PW를 입력하세요 : ");
		myAccount.setmPW(inputStr.next());
		
	}
}
