package com.javaex.ex11;

public class Student extends Person {

	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		//super() 자동 호출
		System.out.println("Student()");	
	}
	
	public Student(String schoolName) {
		//super() 자동 호출
		this.schoolName = schoolName;
		System.out.println("Student(1)");	
	}
	
	public Student(String name, int age, String schoolName) {
//		super(); 자동 호출
		super.name = name; // 부모 클래스 변수가 protected로 선언되면 자식 클래스에서 접근 가능
		super.age = age;

//		super.setName(name);
//		super.setAge(age);
		
//		super(name,age);   --> super() 대신
		this.schoolName = schoolName; 
		System.out.println("Student(3)");	
	}
	
	//메소드g/s
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	
	//메소드 일반
	@Override
	public String toString() {	// 메소드 오버라이딩(재정의)
		return "Student [schoolName=" + schoolName + ", name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() {  // 메소드 오버라이딩(재정의)
		System.out.println("====================");
		System.out.println("이름:"+super.getName());
		System.out.println("나이:"+super.getAge());
		System.out.println("학교:"+this.getSchoolName());
		System.out.println("====================");
		System.out.println("");
	}

}
