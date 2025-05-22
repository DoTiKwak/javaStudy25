package ch04;

import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Member[] members = null;
		
		System.out.println("가입할 회원 수를 입력하세요.");
		System.out.print(">>>");
		int count = input.nextInt();
		members = new Member[count]; // 키보드로 입력한 수 만큼 배열 생성
		
		System.out.println("회원가입 프로그램을 시작합니다.");
		boolean run = true;
		while(run) {
			
			System.out.println("1. 회원가입");
			System.out.println("2. 회원 전체보기");
			System.out.println("3. 로그인");
			System.out.println("4. 회원수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("1~5까지만 입력하세요 (다른 키가 눌리면 꺼집니다.");
			System.out.print(">>>");
			int select = input.nextInt();
			
			switch(select) {
			
			case 1 : 
				Member member1 = new Member(); // 객체 생성
				for(int i=0 ; i < members.length ; i++) {
					
				
				member1 = member1.memberAdd(input); // 생성된 객체 메서드 호출 및 실행
				members[i] = member1;
				
				} // for문(회원 등록) 종료
			break;
			
			case 2 :
				Member member2 = new Member();
				member2.memberAllList(members);
				break;
				
			case 3 :
				Member member3 = new Member();
				member3.memberLogin();
				
			case 4 :
				Member member4 = new Member();
				member4.memberUpdate();
				
			case 5 :
				Member member5 = new Member ();
				member5.memberDelete();
			} // switch문 종료
			
		} //while문 종료
		
		
	} // main method 종료

} // class 종료
