package test03;

public class Controller {
    public void main() {
        Dao dao = new Dao();
        Memo m = new Memo();
        m.setNo(101);
        m.setName("ȫ�浿");
        m.setMsg("ȯ���մϴ�");
        int result = dao.update(m);
        if (result > 1) {
        	System.out.println("���� ����");
        } else {
        	System.out.println("���� ����");
        }
    }
}