package Project01;

public class Pro03Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름이 '홍길동'인 Pro03 객체를 생성하고 p1이 가리키게 한다
		Pro03 p1 = new Pro03("홍길동");
		
		//p1의 나이를 27로 변경한다
		p1.setAge(27);
		
		//p1의 이름과 나이를 출력한다.
		System.out.println(p1.toString());
		//나이가 18인 Pro03 객체를 생성하고 p2가 가리키게 한다
		Pro03 p2 = new Pro03(18);
		//p2의 이름을 '손오공'으로 변경한다
		p2.setName("손오공");;
		//p2의 이름과 나이를 출력한다.
		System.out.println(p2.toString());
		//이름이 '이도룡'이고 나이가 20인 Pro03 객체를 생성하고 p3이 가리키게 한다
		Pro03 p3 = new Pro03("이도룡");
		//p3의 이름과 나이를 출력한다.
		System.out.println(p3.toString());
	}

}
