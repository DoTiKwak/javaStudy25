package ch05.getter_setter;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//음수 속도를 제공
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		// 값을 제공할 때는 setter
		// 값을 받을 때는 getter
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 중지 상태 : " + myCar.getSpeed());
	}

}
