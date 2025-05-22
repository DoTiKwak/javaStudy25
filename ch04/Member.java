package ch04;

import java.util.Scanner;

public class Member {
	// 회원용 객체로 main()메서드는 exam에서 진행함
	// 클래스의 기본속성이 3가지가 필요하다.
	// 필드, 생성자, 메서드
	
	// 필드 : 객체가 가지고 있어야 할 값(변수)
	// 회원번호, id, 이름, 암호, e-mail주소, 집주소, 전화번호
	public int mno ; // 회원번호
	public String id ; // id
	public String pw ; // 암호
	
	public Member() {
		// 기본 생성자 : 클래스명과 같은 메서드
		// Member member = new Member();
	}
	
	public Member memberAdd(Scanner input) {
		Member member = new Member();

		System.out.println("회원가입용 메서드 입니다.");
		System.out.println("회원 번호를 입력하세요.");
		System.out.println("(숫자)>>>");
		member.mno = input.nextInt();
	
		System.out.println("회원 id를 입력해주세요");
		System.out.print(">>>");
		member.id = input.next();
		
		System.out.println("회원 pw를 입력하세요.");
		System.out.print(">>>");
		member.pw = input.next();	
		
		return member;
	}
	
	public void memberAllList(Member[] members) {

		
	}
	
	public void memberLogin() {
		System.out.println("로그인 메서드 입니다.");
	}
	
	public void memberUpdate() {
		System.out.println("회원수정 메서드 입니다.");
	}
	public void memberDelete() {
		System.out.println("회원탈퇴 메서드입니다.");
	}
	
}