package ch03;

import java.util.Random;
import java.util.Scanner;

public class VendingMachinExam {

	public static void main(String[] args) {
		// 자판기 프로그램을 구현
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int N = 4 ;
		String[] menuName = new String[N];
		int[] price = new int[N];
		int[] stock = new int[N];
		int j = 0;
		
		int index = 0;
		while(true) {
			if (index == N) {
				break;
				
			}
			
			System.out.println((index + 1) + "번째 상품 이름을 입력해주세요");
			menuName[index] = sc.next();
			System.out.println(menuName[index] + " 이(가) 맞나요?");
			System.out.println("1.네 2.아니오 : ");
			int ans = sc.nextInt();
			sc.nextLine();
			
			if (ans != 1) {
				System.out.println("다시 입력해주세요");
				
			}
			
			System.out.println(menuName[index] + " 의 상품 가격을 입력해주세요");
			price[index] = sc.nextInt();
			System.out.println(menuName[index] + "의 상품 재고를 입력해주세요");
			stock[index] = sc.nextInt();
			index++;
		}
		
		while (true) {
			
			System.out.println("1. 구매 2. 종료");
			System.out.print(">>>");
			int action = sc.nextInt();
			if(action == 2) {
				System.out.println("구매를 종료합니다.");
				break;
			}else if(action < 1 || 2 < action) {
				System.out.println("잘못 된 입력값입니다.");
				System.out.println("다시 입력해주세요.");
				break;
			}
			
		}
		
		int num;
		int stock2 = 0;
		while(true) {
			System.out.println("=====메뉴=====");
			for(int i = 0; i < N; i++) {
				System.out.println((i + 1) + ". " + menuName[i] + " [" + (stock[i] == 0 ? "SOLD OUT" : stock[i]) + "]");
			}
			
			System.out.println("구매할 상품의 번호를 입력해주세요.");
			num = sc.nextInt();
			if(0 < num && num <= N) {
				if(stock[num - 1] != 0) {
					break;
				}else {
					System.out.println("SOLD OUT");
					System.out.println("다른 상품을 구매해주세요.");
					
				}
			}
			System.out.println("SOLD OUT");
			System.out.println("다시 입력해주세요.");
		
		
		boolean flag = false;
		while(true) {
			System.out.println("선택한 상품은" + num + "번 " + menuName[num - 1] + "입니다.");
			System.out.println("가격 : " + price[num - 1] + "원 재고 : " + stock[num - 1] + "개");
			System.out.println("구매할 수량을 입력해주세요.");
			stock2 = sc.nextInt();
			
			if(stock2 == 0) {
				flag = true;
				break;
			}  else if (0 < stock2 && stock2 <= stock[num-1]) {
				break;
			}
		
		System.out.println("오류가 발생했습니다.");
		System.out.println("다시 입력해주세요.");
		}
		
		} 
		
		int res = price[num - 1] * stock2;
		int money;
		System.out.println("금액 : " + res + "원");
		while(true) {
			System.out.println("돈 입력");
			money = sc.nextInt();
			if(res <= money) {
				break;
			}
			System.out.println("잘못 된 입력입니다.");
			System.out.println("새로 입력해주세요.");
		}
		
		res = money - res;
		if (res != 0) {
			System.out.println("거스름돈 " + res + "원 반환되었습니다.");
		}
		
		System.out.println("구매가 완료되었습니다.");
		
		stock[num - 1] -= stock2;
	} // main 메서드 종료

} // class 종료
