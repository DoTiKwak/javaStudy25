package ch05.extended.school;

public class Student extends Person {
	
	private String studentID; // 학번
	private int grade; // 학년
	private int gpa; // 학점
	
	// Student student = new Student(이름, 키, 몸무게, 나이, 학번, 학년, 학점)
	public Student(String name, int height, int weight, int age, String studentID, int grade, int gpa) {
		super(name, height, weight, age); // 부모생성자의 값을 넣는다
		this.studentID = studentID;
		this.grade = grade;
		this.gpa = gpa;
	}

	public Student(String name, int height, int weight, int age) {
		super(name, height, weight, age);
	}
	// 부모기본생성자 + 자식기본생성자
	public Student() {
		super();
	}

	// 자식 클래스의  getter setter
	public String getStudentID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}

	public int getGpa() {
		return gpa;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	
	// 추가메서드
	public void show() {
		// 입력된 필드를 출력하는 메서드
		System.out.println("-----------------------");
		System.out.println("학생 이름 : " + getName()); // 부모
		System.out.println("학생 나이 : " + getAge()); // 부모
		System.out.println("학생 키 : " + getHeight()); // 부모
		System.out.println("학생 몸무게 : " + getWeight()); // 부모
		System.out.println("-----------------------");
		System.out.println("학번 : " + getStudentID());
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getGpa());
		
	}

}
