
public class Student {
	
	
	public Student() { // 기본 생성자 - 자동 생성
		super(); // 부모클래스의 생성자 호출
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Student(String name, String hakbun, int age, String grade) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
	}




	public Student(String name, String hakbun, int age, String grade, String address) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}




	String name;
	String hakbun;
	int age;
	String grade;
	String address;
	
	public void printName() { // 리턴 값이 없는 메소드 -> void
		System.out.println("학생이름:" + this.name);
	}



}
