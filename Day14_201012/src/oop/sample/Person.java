package oop.sample;
public class Person {
	private String name; // ����ʵ�
	private int age; // ����ʵ�
	private char gender; // ����ʵ�
	// �⺻ ������
	public Person() {}
	// �Ű����� �ִ� ������
	public Person (String name, int age, char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	// getter, setter �޼ҵ�
	public String getName() { return name; }
	public void setName(String name) { 
		this.name= name; 
		}
	public int getAge() { 
		return age; 
		}
	public void setAge(int age) { 
		this.age = age; 
		}
	public char getGender() { 
		return gender; 
		}
	public void setGender(char gender) { 
		this.gender= gender; 
		}
}