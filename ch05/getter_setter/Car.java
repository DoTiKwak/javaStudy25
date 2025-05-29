package ch05.getter_setter;

public class Car {
	// 개인적인 필드
	private int speed;
	private boolean stop;
	
	// 공용 메서드
	
	public int getSpeed() {
		return speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;	
			return;
		} else {
			this.speed = speed;
		}
		
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	} // stop 값이 true이면 스톱을 진행하고 스피드 0으로 조절
	

} // 클래스 종료
