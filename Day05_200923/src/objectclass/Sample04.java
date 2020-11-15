package objectclass;

class Point {
	int x, y;
	public Point() {
		System.out.println("Point 클래스 생성");
	}
}
public class Sample04 {

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.getClass().getName());
		System.out.println(p.toString());
		System.out.println(p);

	}

}
