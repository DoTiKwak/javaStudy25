package ch04;

public class Car {
 // 필드
	public String company; // 제작회사
	public String model; // 아반떼, 그렌져, 소나타 등
	public String color; // 빨강, 검정, 흰색 등
	public int maxSpeed; // 최고 속도
	public String oilType; // 경유, 휘발유
	
	// 상태값(변동가능)
	public int speed;
	public int rpm;
	public int oil;
	
	public Car() {
		speed = 0;
		rpm = 50;
		oil = 100;
	}
	
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	public void start() {
		System.out.println(this.model + "가(이) 주행을 시작합니다.");
	System.out.println("현재 속도 : " + this.speed);
	System.out.println("현재 rpm : " + this.rpm);
	System.out.println("현재 주유량 : " + this.oil);
	
	
	}

		
}
