package ch03;

import java.util.Scanner;

public class VendingMachineExam2 {

	public static void main(String[] args) {
		// 자판기 프로그램

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		String[] Beverage = { "콜라", "커피", "생수", "비타500" };
		int[] price = { 2000, 3000, 1000, 1500 };
		int[] stock = { 20, 20, 10, 30 };
		String id = "khc";
		String pw = "1234";

		boolean run = true;
		boolean session = false; // 로그인 상태 저장용

		while (run) {
			System.out.println("음료 자판기");
			System.out.println("1. 관리자모드  2. 상품구매  9. 사용종료");
			System.out.print(">>>");
			int inputInt1 = inputInt.nextInt();

			switch (inputInt1) {

			case 1:
				System.out.println("관리자 모드로 접속했습니다.");

				session = Logon(id, pw, session);

				if (session = true) {
					System.out.println(id + "님 환영합니다.");
					System.out.println("관리자 메뉴를 사용하실 수 있습니다.");
				} // 관리자 모드 진입 종료
				Admin(Beverage, price, stock );
				break;

			case 2:

				System.out.println("주문하실 상품을 선택해주세요.");
				products();

				break;
			} // 스위치문 종료
		} // while문 종료

	} // main method 종료

	static boolean Logon(String id, String pw, boolean session) {
		// 로그인 여부를 결정하는 메서드
		Scanner inputLogin = new Scanner(System.in);
		System.out.println("로그인 id를 입력하세요");
		System.out.print(">>>");
		String inputId = inputLogin.next(); // 키보드로 id 입력
		System.out.println("로그인 pw를 입력하세요");
		System.out.print(">>>");
		String inputPw = inputLogin.next(); // 키보드로 pw 입력

		if (id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("id와 pw가 일치합니다.");
			System.out.println("로그인 성공");
			session = true;
		} else {
			System.out.println("id와 pw가 불일치합니다.");
			System.out.println("로그인 실패");
			session = false;
		} // id pw 일치 판단문 종료

		return session; // 로그인 성공과 실패 결과를 리턴 함

	} // 관리자 로그인 메서드 종료

	static void products() {
		System.out.println("");

	} // 상품 구매 메서드 종료

	static void Admin(String[] Beverage, int[] price, int[] stock) {

		Scanner input = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		boolean run1 = true;
		System.out.println("관리자 메뉴에 진입했습니다.");
		System.out.println("1. 메뉴 변경 2. 재고 관리 3. 가격 변경");
		int inputNumber = input.nextInt();

		switch (inputNumber) {
		case 1: // 메뉴변경모드
			System.out.println("메뉴 번경 모드로 들어오셨습니다.");
			System.out.println("어떤 메뉴를 변경 하시겠습니까?");
			System.out.println(" ");
			System.out.print(">>>");
			String inputNumber1 = inputStr.next(); // 바꿀 음료수 이름

			for (int i = 0; i < Beverage.length; i++) {

				if (inputNumber1.equals(Beverage[i])) {
					System.out.print("새롭게 추가할 음료를 입력하세요.");
					String changeBev = inputStr.next();
					Beverage[i] = changeBev;
					run1 = false;

				} // if문종료

			} // for문종료
		}
	} // 관리자 메뉴 메서드 종료

} // class 종료