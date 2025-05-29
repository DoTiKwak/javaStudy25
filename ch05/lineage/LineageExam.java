package ch05.lineage;

import java.util.Scanner;

import ch05.lineage.DTO.ElfDTO;
import ch05.lineage.DTO.KnightDTO;

public class LineageExam {
	
	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[10];
	public static Account LoginAccount;
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	
	static {
		knightDTO.setSword("양손검");
		knightDTO.setArmor("가시갑옷");
		knightDTO.setShield("사각나무방패");
		knightDTO.setName("양기사");
		knightDTO.setSex("남");
		knightDTO.setLevel("1");
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000000);
		
		elfDTO.setBow("양손활");
		elfDTO.setDress("천사드레스");
		elfDTO.setArrow("크리티컬화살");
		elfDTO.setName("저요정");
		elfDTO.setSex("여");
		elfDTO.setLevel("1");
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(1000000000);
		
		Account account = new Account();
		account.setId("khc");
		account.setPw("12345");
		account.setNickName("곽각각");
		accounts[0]
		
	}

	public static void main(String[] args) {
		

	} // main 메서드 종료

} // class 종료
