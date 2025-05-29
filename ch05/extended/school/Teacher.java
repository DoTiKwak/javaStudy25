package ch05.extended.school;

public class Teacher extends Person {

	private String teachID; // 교직원 번호
	private int grade; // 담당 학년
	private int room; // 담당 교실
	private int Stcount; // 학생 수
	
	public Teacher() { // 기본 생성자
		super();
	}

	public String getTeachID() {
		return teachID;
	}

	public int getGrade() {
		return grade;
	}

	public int getRoom() {
		return room;
	}

	public int getStcount() {
		return Stcount;
	}

	public void setTeachID(String teachID) {
		this.teachID = teachID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void setStcount(int stcount) {
		Stcount = stcount;
	}

	@Override
	public String toString() {
		return "Teacher [teachID=" + teachID + ", grade=" + grade + ", room=" + room + ", Stcount=" + Stcount
				+ ", getName()=" + getName() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAge()=" + getAge() + "]";
	}


	
}
