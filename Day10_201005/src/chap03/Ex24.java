package chap03;

public class Ex24 {

	static int a = 11;  // ����ʵ�

	static void print() {  //�޼ҵ�(���)
		int a = -1;
		System.out.println("print() : " + a);
	}

	public static void main(String[] args) {

		System.out.println("main() : " + a);
		print();
	}

}


