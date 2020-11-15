package com.chap04;  //패키지 : 소문자로 시작해야한다.

class Data{ //클래스 : 대문자로 시작해야한다.
	public String name; //멤버필드에만 접근 제한자가 붙는다.
	public int age;
	
	//지역변수에서는 접근 제한자가 붙지 않는다.
	public Data() {  //여기서도 지역변수 선언 가능하고	
		name="초기값"; 
		age = -1;	
		System.out.println("생성자 생성완료");
	}
	public Data(String name) {
		this.name = name;
		this.age = -1;				
	}
	public Data(int age) {	
		this.name = "초기값";	
		this.age = age;
	}
	//여기서도 지역변수 선언 가능
	public void print() { //메소드 : 소문자로 시작해야한다. 
		System.out.println(name);
		System.out.println(age);
	}
}
public class Ex30 {

	public static void main(String[] args) {
		Data d1 = new Data();
		
		d1.print();
		// 정적메소드(static)가 아닐 경우 이렇게 생성자 새로 생성해서 출력
		// print(); -> 정적메소드(static)일 경우 이렇게 출력
		Data d2 = new Data("hanna");
		d2.print();
		Data d3 = new Data(33);
		d3.print();

	}

}
