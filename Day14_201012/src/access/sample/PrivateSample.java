package access.sample;

//java���Ͽ��� publicŬ������ �ݵ�� �����ؾ� �Ѵ�.
//�ҽ����� �̸��� ������ Ŭ������ �ݵ�� ����!!! + public
public class PrivateSample {
	//Ŭ���� : ����ʵ�, ������, �޼ҵ�
	private int num; //����� Ŭ���� �ȿ����� ���� ����
	
	public int getNum() { //�� ȣ���� ���� Getter
		return num;
	}
	
	public void setNum(int num) { //�� ������ ���� Setter
		this.num = num;
	}	
}
