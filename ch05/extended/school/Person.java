package ch05.extended.school;

public class Person {

	private String name;
	private int height;
	private int weight;
	private int age;

	public Person(String name, int height, int weight, int age) {

		super(); // 부모 생성자 -> superclass (java의 최상위 부모객체) -> 생략가능
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public Person() { // 기본 생성자 = new Person();
	super();
	}

	public String getName() {
		return name + "님";
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
