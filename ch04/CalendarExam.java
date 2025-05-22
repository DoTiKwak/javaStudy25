package ch04;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
				
				switch(week) {
				case 1 :
					today = Week.SUNDAY; break;	
				case 2 : 
					today = Week.MONDAY; break;
				case 3 :
					today = Week.TUESDAY; break;
				case 4 :
					today = Week.WEDNESDAY; break;
				case 5 :
					today = Week.THURSDAY; break;
				case 6 : 
					today = Week.FRIDAY; break;
				case 7 :
					today = Week.SATURDAY; break;
				
				} // 요일별 스위치문 종료
				
				System.out.println("현재 날짜는 " + year + "년 " +  month + "월 " + day + "일(" + today +") 입니다.");

	} // 메인메서드 종료

} // class 종료
