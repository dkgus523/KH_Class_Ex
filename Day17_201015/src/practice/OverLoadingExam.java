package practice;

public class OverLoadingExam {
	public int color;
	public String strColor;
	
	//int를 인자로 하는 setColor 메소드
	public void setColor(int color) {
		this.color = color;
	}
	//String을 인자로 하는 setColor 메소드
	public void setColor(String color) {
		this.strColor = color;
	}
	
	public static void main(String[] args) {
		OverLoadingExam o = new OverLoadingExam(); //인스턴스 생성
		//메소드 호출
		o.setColor(20);
		o.setColor("Red");

		System.out.println("컬러 : " + o.color + ", " + o.strColor);
	}

}
