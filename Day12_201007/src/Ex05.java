class Data2 {
	int b;
	public Data2() {
		System.out.println("Data 객체 생성완료");
	}
}
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2[] d = new Data2[2];
		d[0] = new Data2();
		d[1] = new Data2();
		d[0].b = 1;
		d[0].b = 2;
		System.out.println(d[0] + ", " + d[0]);

	}

}
