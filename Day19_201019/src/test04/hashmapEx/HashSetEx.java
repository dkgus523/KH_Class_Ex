package test04.hashmapEx;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String str = scan.next();
		set.add(new Person(str,36));
		set.add(new Person("hanna",36));
		set.add(new Person("mina",18));
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" + age;
	}
}