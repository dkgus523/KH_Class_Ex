package practice;

public class OverLoadingExam {
	public int color;
	public String strColor;
	
	//int�� ���ڷ� �ϴ� setColor �޼ҵ�
	public void setColor(int color) {
		this.color = color;
	}
	//String�� ���ڷ� �ϴ� setColor �޼ҵ�
	public void setColor(String color) {
		this.strColor = color;
	}
	
	public static void main(String[] args) {
		OverLoadingExam o = new OverLoadingExam(); //�ν��Ͻ� ����
		//�޼ҵ� ȣ��
		o.setColor(20);
		o.setColor("Red");

		System.out.println("�÷� : " + o.color + ", " + o.strColor);
	}

}
