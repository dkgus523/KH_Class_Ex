package class_ex;
class Rectangle{
	int width, height;
	int area() {
		return width*height;
	}
}
public class Class_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle myRect  = new Rectangle();
		myRect.width = 10;
		myRect.height = 20;
		System.out.println("면적은" + myRect.area());

	}

}
