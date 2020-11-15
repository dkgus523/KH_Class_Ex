package Project04;

public class PersonDriver {
	static void reset() {
		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;
	}
	static void print() {
		Person person = new Person();
		System.out.println("age : " + person.age);
		System.out.println("name : " + person.name);
		System.out.println("isMarried : " + person.isMarried);
		System.out.println("numberOfChildren : " + person.numberOfChildren);
	}
	void main(String[] args) {
			reset();
			print();
	}

}
