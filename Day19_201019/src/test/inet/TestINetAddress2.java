package test.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestINetAddress2 {

	public static void main(String[] args) throws UnknownHostException {
		// Ű����� ȣ��Ʈ���� �Է¹޾�, �ش� ȣ��Ʈ�� ���� ip �ּ� ��θ� ��� ó��
		do{
			System.out.print("ȣ��Ʈ�� (����: none) : ");
			String host = new Scanner(System.in).next();
			if(host.equals("none") != true){
				InetAddress[] ips = InetAddress.getAllByName(host);
				System.out.println(host + "�� ���� ip�� " + ips.length + "�� �Դϴ�.");
				for(InetAddress ip : ips)
					System.out.println(ip.getHostAddress());
		}else
			break;
		}while(true);
	}

}
