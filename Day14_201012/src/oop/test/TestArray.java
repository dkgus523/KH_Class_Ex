package oop.test;
import oop.sample. Person;
public class TestArray {
	public static void main(String[] args) {
		Person[] list = new Person[3]; // 3���� ������ �� �ִ� ��ü�迭 ����
		list[0]=new Person("�谳��", 19, '��');
		list[1]=new Person("�踻��", 20, '��');
		list[2]=new Person("��Ҷ�", 22, '��');
		
		
		Person[] list1 = {new Person("�谳��", 19, '��'), new Person("�踻��", 20, '��')};
		//�� ��ü�� ����� ���� �̸����
		for(int i=0; i<list1.length;i++){
			System.out.println(list1[i].getName());
		}
	}
}