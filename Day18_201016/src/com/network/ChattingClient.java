package com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChattingClient implements Runnable {
	String ip = "127.0.0.1";
	int port = 6060;
	Socket sk;
	
	public void chattingClient() {
		try {
			sk = new Socket(ip, port);
			System.out.println("ä�ü����� ����Ǿ����ϴ�...");
			//������ ���� �޼����� Ű����� �Է¹޴� ��Ʈ�� ����
			InputStreamReader inR = new InputStreamReader(System.in);
			BufferedReader buR = new BufferedReader(inR);
			
			PrintWritter pout = new PrintWritter(sk.getOutputStream(), true);
			
			Thread thr = new Thread(this);
			thr.start();
			String sendMsg = "";
			while((sendMsg = buR.readLine())!=null) {
				pout.println(sendMsg);
			}//while
		} catch(Exception e) {
			e.printStackTrace();
		}
	}//������
	public void run() {
		try {
			InputStream ins = sk.getInputStream();
			BufferedReader buR = new BufferedReader(new InputStreamReader(ins));
			String svrMsg = "";
			while(true) {
				svrMsg = buR.readLine();
				System.out.println("Server > " + svrMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChattingClient();

	}

}
