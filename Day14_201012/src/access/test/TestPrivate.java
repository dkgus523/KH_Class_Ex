package access.test;
import access.sample.PrivateSample;
public class TestPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateSample psamp = new PrivateSample(); //�ν��Ͻ�ȭ �ߴ�.
		
		//psamp.num = 10; //private�̹Ƿ� ���� ���� ���� �߻�
		
		psamp.setNum(10); //public�̹Ƿ� ���� ����
		System.out.println(psamp.getNum()); // public �̹Ƿ� ���� ����
	}

}
