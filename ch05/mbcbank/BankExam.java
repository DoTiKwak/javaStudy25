package ch05.mbcbank;

import java.util.Scanner;

public class BankExam {
	// 필드
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	public static AccountDTO[] hanaBank = new AccountDTO[10];
	public static AccountDTO[] wooriBank = new AccountDTO[10];
	public static AccountDTO[] nhBank = new AccountDTO[10];
	public static AccountDTO session = null;

	// 생성자 - static block
	static {
		AccountDTO accountDTO0 = new AccountDTO("94290200222405", "곽현창", 5000000, "하나");
		hanaBank[0] = accountDTO0;

		AccountDTO accountDTO1 = new AccountDTO("01031817882", "이상혁", 15571557, "우리");
		wooriBank[0] = accountDTO1;

		AccountDTO accountDTO2 = new AccountDTO("971009001022", "김도영", 500000000, "농협");
		nhBank[0] = accountDTO2;
	}

	// 메서드
	public static void main(String[] args) {
		// 은행 프로그램 만들기
		boolean run = true;
		while (run) {
			System.out.println("=============================");
			System.out.println("MBC코인시스템에 오신 것을 환영합니다.");
			System.out.println("=============================");
			System.out.println("1. 하나은행");
			System.out.println("2. 우리은행");
			System.out.println("3. 농협은행");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			switch(select) {
			case "1" :
				System.out.println("1. 하나은행입니다.");
				HanaBankService hanaBankService = new HanaBankService();
				hanaBankService.menu(inputStr, inputInt, hanaBank);
				break;
			case "2" :
				System.out.println("2. 우리은행입니다.");
				break;
			case "3" :
				System.out.println("3. 농협은행입니다.");
				break;
			case "4" :
				System.out.println("4. 프로그램을 종료합니다.");
				break;
			}
			
		} // while문 종료 (코인시스템 메뉴)

	} // main메서드 종료

} // class 종료
