package prac01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Application {

	public static void main(String[] args) {
		 try (ServerSocket serverSocket = new ServerSocket(1905)) {
	            Socket client;
	            System.out.println("while �ٱ�");
	            while ((client = serverSocket.accept()) != null) {
	                System.out.println("����� ��");
	                final RequestHandler handler = new RequestHandler(client);  // runnable
	                final Thread thread = new Thread(handler);
	                thread.start();
	                System.out.println("�����忡�� ����");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
