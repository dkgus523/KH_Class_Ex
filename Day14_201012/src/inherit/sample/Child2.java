package inherit.sample;
public class Child2 extends Parent2 {
public Child2() {
super(); // �θ� �⺻ ������ ȣ��
System.out.println("�ڽ� �⺻ ������");
}
 @Override
public void out() {
super.out(); // �θ� �޼ҵ� out() ȣ��
System.out.println("�ڽ� out() �޼ҵ�");
}
}