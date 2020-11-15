package test.main;

import test.inet.InetAddressEx;
import test.tcp.TCPEchoServer;

public class Main {

	public static void main(String[] args) {
		//new InetAddressEx().testInetAddress("www.oracle.com");
		new TCPEchoServer().tcpServer(9007);
	}

}
