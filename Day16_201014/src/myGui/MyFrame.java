package myGui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Awt ȭ���� �����ϴ� Ŭ����
public class MyFrame {
	private Frame fr; //���� ȭ�� ��ü
	private Label label;
	private Panel panel;
	
	public MyFrame() {
		initFrame();
	}
	
	//���� ȭ�鿡 ���� ����
	private void initFrame() {
		fr = new Frame("First GUI");
		fr.setSize(300, 300);
		fr.setLayout(new GridLayout(3,1));
		fr.setVisible(true);
	
	
	//GUI���α׷� �����̺�Ʈ ó��
	fr.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	
	//������ ������ ǥ���ϴ� label ��ü
	label = new Label();
	label.setText("Status Label");
	label.setAlignment(Label.CENTER);
	label.setSize(200,100);
	
	//��ư�� ��� ���� panel ��ü
	panel = new Panel();
	panel.setLayout(new FlowLayout());
	
	//panel�� label�� frame�� �߰��ϰ� ȭ�鿡 ���̵��� ��
	fr.add(panel);
	fr.add(label);
	fr.setVisible(true);
	}
	
	//��ư�� �����ϰ� Ŭ�� �̺�Ʈ�� ó���ϴ� �޼ҵ�
	void showButton() {
	Button btnOK = new Button("OK");
	Button btnCancel = new Button("cancel");
	
	//btnCancel ��ư�� Ŭ���� ��� label�� "Ȯ��" ���� ���
	btnOK.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			label.setText("Ȯ��");
		}
	});
	
	//btnCancel ��ư�� Ŭ���� ��� label�� "���" ���� ���
	btnCancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			label.setText("���");
		}
	});
	
	//panel ��ü�� 2���� ��ư�� �߰��ϰ� frame�� ���
	panel.add(btnOK);
	panel.add(btnCancel);
	fr.setVisible(true);
	}
}
	

