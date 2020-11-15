package com.network;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestclientGUI extends JFrame implements ActionListener {
	
	static TestClient client = new TestClient();
	TestServer server = new TestServer();
	static JTextArea textArea = new JTextArea(20,30);
	JTextField textField = new JTextField();
	JButton inputBt = new JButton("�Է�");
	JScrollPane scroll = new JScrollPane(textArea);
	
	public void TestClientGUI() {
		setLayout(null);
		
		scroll.setBounds(0,0,490,500);
		textField.setBounds(0,500,400,30);
		inputBt.setBounds(400,500,80,30);
		
		add(scroll);
		add(textField);
		add(inputBt);
		
		setTitle("TestClient");
		setBounds(0,0,500,570);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		inputBt.addActionListener(this);
	}
	public void actionperformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case "�Է�":
			String msg = textField.getText() + "\n";
			if(textField.getText().length() > 0) {
				textArea.append(msg);
				client.msgSend(msg);
				textField.setText("");
			}
			textField.requestFocusInWindow();
			break;
		}
		
	}
	public static void main(String[] args) {
		TestclientGUI t = new TestclientGUI();
		client.connect();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
